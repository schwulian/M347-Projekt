CREATE TABLE films (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    duration float NOT NULL,
    regiseur VARCHAR(255) NOT NULL
);

INSERT INTO films (id, title, duration, regiseur) VALUES
    ('Inception', 148, 'Christopher Nolan'),
    ('The Godfather', 175, 'Francis Ford Coppola'),
    ('Minions', 182, 'Gru der Wahre');