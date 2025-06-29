import { useState } from 'react';
import { TextField, Button, Stack } from '@mui/material';

export default function AddFilmForm({ onAdd }) {
    const [titel, setTitel] = useState('');
    const [regisseur, setRegisseur] = useState('');
    const [runtime, setRuntime] = useState('');
    const [rating, setRating] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        onAdd({ titel, regisseur, runtime, rating });
        setTitel('');
        setRegisseur('');
        setRuntime('');
        setRating('');
    };

    return (
        <form onSubmit={handleSubmit}>
            <Stack spacing={2}>
                <TextField label="Titel" value={titel} onChange={(e) => setTitel(e.target.value)} required />
                <TextField label="Regisseur" value={regisseur} onChange={(e) => setRegisseur(e.target.value)} required />
                <TextField label="Laufzeit (min)" type="number" value={runtime} onChange={(e) => setRuntime(e.target.value)} required />
                <TextField label="Bewertung" value={rating} onChange={(e) => setRating(e.target.value)} required />
                <Button type="submit" variant="contained">Film hinzufügen</Button>
            </Stack>
        </form>
    );
}
