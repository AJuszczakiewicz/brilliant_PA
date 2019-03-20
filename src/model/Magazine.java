package model;

import java.util.Date;

public class Magazine extends MediaItem implements Readable {

    private String publisher;
    private String category;

    Magazine(String title, Date releaseDate, boolean availability, String publisher, String category) {
        super(title, releaseDate, availability);
        this.publisher = publisher;
        this.category = category;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public void read() {}

}
