package model;

import java.util.Date;

public abstract class MediaItem {

    private String title;
    private Date releaseDate;
    private boolean availability;

    MediaItem(String title, Date releaseDate, boolean availability) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void isAvailable(boolean availability) {
        this.availability = availability;
    }
}

