CREATE TABLE IF NOT EXISTS Game (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    title VARCHAR (50),
    platform VARCHAR (20),
    releaseDate DATE,
    score INTEGER,
    summary TEXT,
    price INTEGER
);