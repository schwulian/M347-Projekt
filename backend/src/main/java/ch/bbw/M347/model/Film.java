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
    private float duration; //minuten
    private int releaseDate;

    public Film() {}

    public Film(String title, String regisseur, float duration, int releaseDate) {
        this.title = title;
        this.regisseur = regisseur;
        this.duration = duration;
        this.releaseDate = releaseDate;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getRegisseur() { return regisseur; }
    public void setRegisseur(String regisseur) { this.regisseur = regisseur; }

    public float getDuration() { return duration; }
    public void setDuration(float duration) { this.duration = duration; }

    public int getReleaseDate() { return releaseDate; }
    public void setReleaseDate(int releaseDate) { this.releaseDate = releaseDate; }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", regisseur='" + regisseur + '\'' +
                ", duration=" + duration +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
