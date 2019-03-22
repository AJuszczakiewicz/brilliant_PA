package model;

import java.util.Map;

public class Book extends MediaItem implements Readable{

    Book(String title, String releaseDate, boolean availability, Map<String, String> metadata) {
        super(title, releaseDate, availability, metadata);
    }

    @Override
    public void read() {

    }
}
