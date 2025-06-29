import { List, ListItem, ListItemText, IconButton } from '@mui/material';
import DeleteIcon from '@mui/icons-material/Delete';

export default function FilmList({ films, onDelete }) {
    return (
        <List>
            {films.map((film) => (
                <ListItem key={film.id}
                          secondaryAction={
                              <IconButton edge="end" onClick={() => onDelete(film.id)}>
                                  <DeleteIcon />
                              </IconButton>
                          }>
                    <ListItemText
                        primary={film.titel}
                        secondary={`Regisseur: ${film.regisseur} • Laufzeit: ${film.runtime} min • Bewertung: ${film.rating}`}
                    />
                </ListItem>
            ))}
        </List>
    );
}
