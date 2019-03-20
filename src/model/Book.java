package model;

import java.util.Date;

public class Book extends MediaItem implements Readable{

    private String author;

    Book(String title, Date releaseDate, boolean availability, String author) {
        super(title, releaseDate, availability);
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void read() {

    }

    @Override
    public String preview(){
            return
                    "\nAuthor: " + this.author +
                    "\nTitle: " + this.getTitle() +
                    "\nAvailable: " + this.isAvailable() +
                    "\nRealise date: " + this.getReleaseDate();


    }
}
