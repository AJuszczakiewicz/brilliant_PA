package model;

public class MagazineModel extends MediaItem implements Readable {


    public MagazineModel(int ID, String title, boolean availability, Metadata metadata) {
        super(ID, title, availability, metadata);
    }

    @Override
    public void read() {
    }

    @Override
    public void preview() {
        read();
    }

}

