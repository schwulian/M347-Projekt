package ch.bbw.M347.controller;

import ch.bbw.M347.model.Film;
import ch.bbw.M347.repository.FilmRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/Films")
public class FilmController {
    private final FilmRepo repo;

    public FilmController(FilmRepo repo){
        this.repo = repo;
    }

    @PostMapping("/Film")
    public ResponseEntity<String> createFilm(@RequestBody Film film){
        Film savedFilm = repo.save(film);
        return ResponseEntity.ok("Film added");
    }
}
