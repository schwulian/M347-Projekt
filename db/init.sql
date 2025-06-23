CREATE TABLE films (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    duration float NOT NULL,
    regiseur VARCHAR(255) NOT NULL,
    film_url VARCHAR(255) NOT NULL
);

INSERT INTO films (title, duration, regiseur, film_url) VALUES
    ('Inception', 148, 'Christopher Nolan', 'https://musicart.xboxlive.com/7/1f4b1200-0000-0000-0000-000000000002/504/image.jpg'),
    ('The Godfather', 175, 'Francis Ford Coppola', 'https://m.media-amazon.com/images/M/MV5BNGEwYjgwOGQtYjg5ZS00Njc1LTk2ZGEtM2QwZWQ2NjdhZTE5XkEyXkFqcGc@._V1_.jpg'),
    ('Minions', 182, 'Gru der Wahre', 'https://images.prod.ecom.mueller.de/_next/image/?url=https%3A%2F%2Fstatic.prod.ecom.mueller.de%2Fproducts%2F5053083026356%2Fvideojakob_5053083026356_pv_463075.jpg&w=2880&q=75');