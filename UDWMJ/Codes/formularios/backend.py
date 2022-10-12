from flask import Flask, render_template, request

app = Flask(__name__)
app.config["TEMPLATES_AUTO_RELOAD"] = True

@app.route('/formulario')
def abrirform():
    return render_template('formulario.html')

# @app.route('/processar', methods = ['POST',])
# def criar_tabela_dados():
#     nome = request.form["nome"]
#     senha = request.form["senha"]
#     email = request.form["email"]
#     return f"""<table>
#         <tr><td>Nome</td><td>{nome.upper()}</td></tr>
#         <tr><td>Senha</td><td>{senha.upper()}</td></tr>
#         <tr><td>E-mail</td><td>{email.upper()}</td></tr>
#        </table>"""

@app.route('/processar', methods = ['POST',])
def criar_tabela_dados():
    nome = request.form["nome"]
    senha = request.form["senha"]
    email = request.form["email"]
    return f"""<table>
        <tr><td>Nome</td><td>{nome.upper()}</td></tr>
        <tr><td>Senha</td><td>{senha.upper()}</td></tr>
        <tr><td>E-mail</td><td>{email.upper()}</td></tr>
        </table>"""
