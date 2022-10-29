import { Router } from 'express'

import GamesController from './controllers/games-controller'

const routes = Router()

routes.get('/games', GamesController.find)
routes.get('/games/:id', GamesController.findById)
routes.post('/games', GamesController.create)
routes.put('/games/:id', GamesController.update)
routes.delete('/games/:id', GamesController.delete)

export default routes