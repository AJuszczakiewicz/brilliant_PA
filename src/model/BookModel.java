package model;

public class BookModel extends MediaItem implements Readable {

    public BookModel(int ID, String title, boolean availability, Metadata metadata) {
        super(ID, title, availability, metadata);
    }

    @Override
    public void read() {
    }
}
