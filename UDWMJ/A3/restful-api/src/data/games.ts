interface IGames {
    id?: number
    name: string
    rating: number
}

const games: IGames[] = [
    { id: 1, name: 'The Legend of Zelda: Ocarina of Time', rating: 99 },
    { id: 2, name: "Tony Hawk's Pro Skater 2", rating: 98 },
    { id: 3, name: 'Grand Theft Auto IV', rating: 98 },
    { id: 4, name: 'Soulcalibur', rating: 98 },
    { id: 5, name: 'Super Mario Galaxy', rating: 97 },
]

export default games