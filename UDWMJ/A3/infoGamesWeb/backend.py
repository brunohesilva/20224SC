import sqlite3
from flask import Flask, request, render_template
from flask import g
import imgkit

# imgkit.from_file('home.html', 'homeImage.jpg')

BANCO_DE_DADOS = './banco.db'

app = Flask(__name__)
app.config["TEMPLATES_AUTO_RELOAD"] = True

def carregar_banco():
    banco = getattr(g, '_database', None)

    if banco is None:
        g._database = sqlite3.connect(BANCO_DE_DADOS)
        banco = g._database
    return banco

def iniciar_tabela():
    banco = carregar_banco()
    script_criacao = open('schema.sql').read()
    banco.executescript(script_criacao)

@app.route('/')
def index():
    banco = carregar_banco()
    iniciar_tabela()
    return render_template('home.html')


@app.route('/header')
def header():
    return render_template('header.html')


@app.route('/create')
def game_create():
    return render_template('game_create.html')

@app.route('/add', methods=['POST', ])
def save_info():
    banco = carregar_banco()
    cur = banco.cursor()
    
    title = request.form["title"]
    platform = request.form["platform"]
    releaseDate = request.form["releaseDate"]
    score = request.form["score"]
    summary = request.form["summary"]
    price = request.form["price"]

    cur.execute("""
        INSERT INTO Game
                (title, platform, releaseDate, score, summary, price)
        VALUES (?, ?, ?, ?, ?, ?) """,
                (title, platform, releaseDate, score, summary, price)
                )
    banco.commit()
    banco.close()
    "Nome: %s, Plataforma: %s, Data de Lançamento: %s, Nota: %s, Resumo: %s, Preço: %s" % (title, platform, releaseDate, score, summary, price)
    return render_template("home.html")

@app.route('/show', methods=['POST', ])
def show_info():
    banco = carregar_banco()
    cur = banco.cursor()

    id = request.form["id"]
    resultados = cur.execute("""
        SELECT id, title, platform, releaseDate, score, summary, price
        FROM Game
        WHERE id = ?
        """, (id,)
    ).fetchall()
    banco.commit()
    banco.close()
    return render_template("results_read.html",
                           resultados=resultados)

@app.route('/read')
def game_read():
    return render_template('game_read.html')

@app.route('/read')
def list_games():
    banco = carregar_banco()
    cur = banco.cursor()

    resultados = cur.execute("""
        SELECT id, title, platform, releaseDate, score, summary, price
        FROM Game """
                     ).fetchall()
    banco.commit()
    banco.close()
    return render_template("read_results.html",
                          resultados=resultados)

@app.route('/update')
def game_update():
    return render_template('game_update.html')

@app.route('/gameupdate', methods=['POST', ])
def updategame():
    banco = carregar_banco()
    cur = banco.cursor()

    id = request.form["id"]
    title = request.form["title"]
    platform = request.form["platform"]
    releaseDate = request.form["releaseDate"]
    score = request.form["score"]
    summary = request.form["summary"]
    price = request.form["price"]

    cur.execute("""
        UPDATE Game
        SET title=?, platform=?, releaseDate=?, score=?, summary=?, price=?
        WHERE id = ?
        """, (title, platform, releaseDate, score, summary, price, id,)
        ).fetchall()
    banco.commit()
    banco.close()
    return '<h1 style="color:white;">Game Atualizado com Sucesso.</h1>'

@app.route('/delete')
def game_delete():
    return render_template('game_delete.html')

@app.route('/deletegame', methods=['POST', ])
def delete_game():
    banco = carregar_banco()
    cur = banco.cursor()

    id = request.form["id"]
    cur.execute("""
        DELETE FROM Game
        WHERE id = ?""", (id,)
                ).fetchall()
    banco.commit()
    banco.close()
    return '<h1 style="color:white; text-align:center;">Game Removido com Sucesso.</h1>'


 
