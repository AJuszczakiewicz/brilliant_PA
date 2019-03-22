package model;

import java.util.Map;

public class Film extends MediaItem implements Watchable{


    Film(String title, String releaseDate, boolean availability, Map<String, String> metadata) {
        super(title, releaseDate, availability, metadata);
    }

    @Override
    public void watch() {}

}
