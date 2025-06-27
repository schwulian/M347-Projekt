package ch.bbw.M347.controller;

import ch.bbw.M347.model.Film;
import ch.bbw.M347.repository.FilmRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FilmController {
    private final FilmRepo repo;

    public FilmController(FilmRepo repo) {
        this.repo = repo;
    }

    @PostMapping("/film")
    public ResponseEntity<String> createFilm(
            @RequestBody Film film
    ) {
        repo.save(film);
        return ResponseEntity.status(HttpStatus.CREATED).body("Film hinzugefügt");
    }

    @GetMapping("/film/{filmId}")
    public ResponseEntity<String> getFilmById(
            @PathVariable Long filmId
    ) {
        Optional<Film> film = repo.findById(filmId);

        return ResponseEntity.ok("Film: " + film.toString());
    }

    @GetMapping("/film")
    public ResponseEntity<List<Film>> getAllFilms() {
        List<Film> films = repo.findAll();
        return ResponseEntity.ok(films);
    }

    @PutMapping("/film/{filmId}")
    public ResponseEntity<String> updateFilmById(
            @PathVariable Long filmId,
            @RequestBody Film newFilm
    ) {
        Optional<Film> filmToBeChangedOptional = repo.findById(filmId);

        if (filmToBeChangedOptional.isPresent()) {
            Film filmToBeChanged = filmToBeChangedOptional.get();

            filmToBeChanged.setRegisseur(newFilm.getRegisseur());
            filmToBeChanged.setTitle(newFilm.getTitle());
            filmToBeChanged.setDuration(newFilm.getDuration());
            filmToBeChanged.setReleaseDate(newFilm.getReleaseDate());

            repo.save(filmToBeChanged);

            return ResponseEntity.ok("tmm");
        } else {
            return ResponseEntity.status(404).body("nld gfunde");
        }
    }

    @DeleteMapping("film/{filmId}")
    public ResponseEntity<String> deleteById(
            @PathVariable Long filmId
    ) {
        if (repo.existsById(filmId)) {
            repo.deleteById(filmId);
            return ResponseEntity.ok("deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found");
        }
    }


}
