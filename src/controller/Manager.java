package controller;

import data.MediaLibrary;
import model.MediaItem;

import java.util.Map;

public class Manager extends User {

    public Manager(MediaLibrary mediaLibrary, String name, String surname, int idNumber) {
        super(mediaLibrary, name, surname, idNumber);
    }
    public void addItemToLibrary(MediaItem item) {
        if (item == null){
            return;
        }
        mediaLibrary.addMediaItem(item);
    }

    public void removeItemFromLibrary(MediaItem item) {
        if (item == null){
            return;
        }
        mediaLibrary.removeMediaItem(item);
    }

    public void editMediaItem(MediaItem item, String newTitle, String newReleaseDate,
                              boolean newAvailability, Map<String, String> metadata) {

        item.editMetaData(newTitle, newReleaseDate, newAvailability, metadata);
    }

    public void editMediaItem(String title, String newTitle, String newReleaseDate,
                              boolean newAvailability, Map<String, String> metadata) {

        MediaItem item = mediaLibrary.searchForItem(title);
        item.editMetaData(newTitle, newReleaseDate, newAvailability, metadata);
    }

    public void editMediaItem(int ID, String newTitle, String newReleaseDate,
                              boolean newAvailability, Map<String, String> metadata) {

        MediaItem item = mediaLibrary.searchForItem(ID);
        item.editMetaData(newTitle, newReleaseDate, newAvailability, metadata);
    }

}
