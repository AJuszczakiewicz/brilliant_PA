package model;

import java.util.Date;

public class Album extends MediaItem implements Listenable {

    private String band;

    Album(String title, Date releaseDate, boolean availability, String band) {
        super(title, releaseDate, availability);
        this.band = band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    @Override
    public void play() {
    }

    @Override
    public String preview() {
        return
                "\nBand: " + this.band +
                        "\nTitle: " + this.getTitle() +
                        "\nAvailable: " + this.isAvailable() +
                        "\nRealise date: " + this.getReleaseDate();
    }
}
