package model;

import java.util.HashMap;
import java.util.Map;

public abstract class MediaItem {

    private String title;
    private String releaseDate;
    private boolean availability;
    private Map<String, String> metadata = new HashMap<String, String>();

    MediaItem(String title, String releaseDate, boolean availability, Map<String, String> metadata) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.availability = availability;
        this.metadata = metadata;
    }


    public String preview() {
        String preview = String.format("Title: %s", this.title);

        for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
            preview += "\n" + entry.getKey() + " " + entry.getValue();
        }

        return preview;

    }

    public String getTitle() {
        return title;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public boolean isAvailable() {
        return availability;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}

