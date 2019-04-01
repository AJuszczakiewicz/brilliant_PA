package model;

public class AlbumModel extends MediaItem implements Listenable {

    public AlbumModel(int ID, String title, boolean availability, Metadata metadata) {
        super(ID, title, availability, metadata);
    }

    @Override
    public void play() {
    }

    @Override
    public void preview() {
        play();
    }
}
