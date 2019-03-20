package controller;

import data.MediaLibrary;
import model.MediaItem;

import java.util.List;

public class Client extends User {
    public Client(MediaLibrary mediaLibrary, String name, String surname, int idNumber) {
        super(mediaLibrary, name, surname, idNumber);
    }

    public void rentItem(MediaItem item) {
    }

    public void returnItem(MediaItem item) {

    }

    public List<MediaItem> getRentedItems() {
        return rentedItems;
    }

    public boolean checkAvailability(MediaItem item) {
        return item.isAvailable();
    }

    public String showMediaItem(String title) {
        MediaItem item = mediaLibrary.searchByTitle(title);
        return item.preview();
    }

}
