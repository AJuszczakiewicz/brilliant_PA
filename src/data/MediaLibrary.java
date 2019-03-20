package data;

import model.MediaItem;

import java.util.ArrayList;
import java.util.List;

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


    public void editMetaData() {
    }
}
