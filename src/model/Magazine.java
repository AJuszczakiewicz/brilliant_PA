package model;

import java.util.Map;

public class Magazine extends MediaItem implements Readable {


    Magazine(String title, String releaseDate, boolean availability, Map<String, String> metadata) {
        super(title, releaseDate, availability, metadata);
    }

    @Override
    public void read() {}

}

