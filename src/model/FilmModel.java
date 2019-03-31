package model;

public class FilmModel extends MediaItem implements Watchable {


    public FilmModel(int ID, String title, boolean availability, Metadata metadata) {
        super(ID, title, availability, metadata);
    }

    @Override
    public void watch() {
    }

}
