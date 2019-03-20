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

    private boolean checkAvailability(MediaItem item) {
        return item.isAvailable();
    }


}
