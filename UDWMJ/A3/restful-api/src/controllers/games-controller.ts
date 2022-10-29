import { Request, Response } from "express"

import games from '../data/games'

class GamesController {
    find(req: Request, res: Response): void {
        res.json(games)
    }

    findById(req: Request, res: Response) : void {
        const id = +req.params.id

        const game = games.find(g => g.id === id)

        if (!game) {
            res.status(404).json({ erro: 'Game não encontrado'})
            return 
        }

        res.json(game)
    }

    create(req: Request, res: Response) : void {
        const {name , rating } = req.body
        const id = games.length + 1

        games.push({ id, name, rating })

        res.status(201).send('Game adicionado')
    }

    update(req: Request, res: Response): void {
        const id = +req.params.id
        const { name, rating} = req.body

        const game = games.find(g => g.id === id)

        if (!game) {
            res.status(404).json({ erro: 'Game não encontrado' })
            return
        }

        games[id - 1] = { id, name, rating }

        res.send('Game atualizado')
    }

    delete(req: Request, res: Response): void {
        const id = +req.params.id

        const { name, rating } = req.body

        const game = games.find(g => g.id === id)

        if (!game) {
            res.status(404).json({ error: 'Game não encontrado' })
            return
        }

        games.splice(id - 1, 1)
        games.forEach(g => g.id = games.indexOf(g) + 1)

        res.send('Produto removido')
    }
}

export default new GamesController
