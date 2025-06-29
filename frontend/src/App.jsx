import { useEffect, useState } from 'react';
import { Container, Typography } from '@mui/material';
import FilmList from './components/FilmList';
import AddFilmForm from './components/AddFilmForm';

export default function App() {
    const [films, setFilms] = useState([]);

    const fetchFilms = async () => {
        const res = await fetch('/api/films');
        const data = await res.json();
        setFilms(data);
    };

    const addFilm = async (film) => {
        await fetch('/api/films', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(film),
        });
        fetchFilms();
    };

    const deleteFilm = async (id) => {
        await fetch(`/api/films/${id}`, { method: 'DELETE' });
        fetchFilms();
    };

    useEffect(() => {
        fetchFilms();
    }, []);

    return (
        <Container sx={{ mt: 4 }}>
            <Typography variant="h3" gutterBottom>🎬 Filmhub</Typography>
            <AddFilmForm onAdd={addFilm} />
            <FilmList films={films} onDelete={deleteFilm} />
        </Container>
    );
}
