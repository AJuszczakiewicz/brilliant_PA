package model;

import java.util.ArrayList;
import java.util.Date;

public class Film extends MediaItem implements Watchable{

    private String director;
    private ArrayList writers;
    private ArrayList stars;


    Film(String title, Date releaseDate, boolean availability, String director) {
        super(title, releaseDate, availability);
        this.director = director;
    }

    Film(String title, Date releaseDate, boolean availability, String director, ArrayList writers) {
        super(title, releaseDate, availability);
        this.director = director;
        this.writers = writers;
    }

    Film(String title, Date releaseDate, boolean availability, String director, ArrayList writers, ArrayList stars) {
        super(title, releaseDate, availability);
        this.director = director;
        this.writers = writers;
        this.stars = stars;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setWriters(ArrayList writers) {
        this.writers = writers;
    }

    public void setStars(ArrayList stars) {
        this.stars = stars;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList getWriters() {
        return writers;
    }

    public ArrayList getStars() {
        return stars;
    }

    @Override
    public void watch() {}

}
