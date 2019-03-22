package model;

import java.util.Map;

public class Album extends MediaItem implements Listenable {

    Album(String title, String releaseDate, boolean availability, Map<String, String> metadata) {
        super(title, releaseDate, availability, metadata);
    }

    @Override
    public void play() {
    }
}
