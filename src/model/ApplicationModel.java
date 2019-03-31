package model;

import java.util.ArrayList;
import java.util.List;

public class ApplicationModel {

    private List<MediaItem> mediaItemsData = new ArrayList<MediaItem>();

    private List<UserModel> users;

    public List<UserModel> getUsers() {
        return users;
    }

    public List<MediaItem> getMediaItemsData() {
        return mediaItemsData;
    }

    public void addMediaItem(MediaItem item) {
        mediaItemsData.add(item);
    }

    public void removeMediaItem(MediaItem item) {
        mediaItemsData.remove(item);

    }

    public void removeMediaItem(String keyWord) {
        MediaItem item = this.searchForItem(keyWord);
    }

    public MediaItem searchForItem(String keyWord) {
        if (mediaItemsData != null) {
            for (MediaItem item : mediaItemsData) {
                if (item.getTitle().equals(keyWord)) {
                    return item;
                } else if (item.getMetadata().getFieldsInMap().containsKey(keyWord)) {
                    return item;
                }
            }
        }
        return null;
    }

    public UserModel searchForUser(String userName) {
        for (UserModel user : users) {
            if (user.getName().equals(userName)) {
                return user;
            }
        }
        return null;
    }
}
