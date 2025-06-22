package ch.bbw.M347.model;

import jakarta.persistence.*;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String regisseur;
    private float duration;
    private int releaseDate;

    public Film() {}

    public Film(String title, String regisseur, float duration, int releaseDate) {
        this.title = title;
        this.regisseur = regisseur;
        this.duration = duration;
        this.releaseDate = releaseDate;
    }
}
