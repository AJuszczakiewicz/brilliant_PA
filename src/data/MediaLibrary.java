package data;

import model.MediaItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MediaLibrary {
    private List<MediaItem> mediaItemsData = new ArrayList<MediaItem>();

    public List<MediaItem> getMediaItemsData() {
        return mediaItemsData;
    }

    public void addMediaItem(MediaItem item) {
        mediaItemsData.add(item);
    }

    public void removeMediaItem(MediaItem item) {
        mediaItemsData.remove(item);
    }

    public MediaItem searchByTitle(String title) {
        for (MediaItem item : mediaItemsData) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public void editMetaData(String title, String newTitle, String newReleaseDate,
                             boolean newAvailability, Map<String, String> metadata) {
        MediaItem item = searchByTitle(title);
        item.setTitle(newTitle);
        item.setReleaseDate(newReleaseDate);
        item.setAvailability(newAvailability);
        item.setMetadata(metadata);
    }
}
