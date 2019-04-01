package model;

public abstract class MediaItem {

    private final int ID;
    private boolean availability;
    private Metadata metadata;
    private String title;

    MediaItem(int ID, String title, boolean availability, Metadata metadata) {
        this.ID = ID;
        this.title = title;
        this.availability = availability;
        this.metadata = metadata;
    }


    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void editMetaData(String newTitle,
                             boolean newAvailability, Metadata metadata) {
        this.setTitle(newTitle);
        this.setAvailability(newAvailability);
        this.setMetadata(metadata);
    }

    public abstract void preview();
}

