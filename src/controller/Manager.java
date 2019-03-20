package controller;

import data.MediaLibrary;
import model.MediaItem;

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

    public void editMediaItem(MediaItem item) {

    }

}
