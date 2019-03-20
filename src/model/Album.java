package model;

import java.util.Date;

public class Album extends MediaItem implements Listenable {

    private String band;

    Album(String title, Date releaseDate, boolean availability, String band) {
        super(title, releaseDate, availability);
        this.band = band;
    }

    @Override
    public void play() {

    }

    public void setBand(String band) {
        this.band = band;
    }
}
