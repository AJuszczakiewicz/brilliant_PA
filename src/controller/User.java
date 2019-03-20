package controller;

import data.MediaLibrary;
import model.MediaItem;

import java.util.ArrayList;
import java.util.List;

public class User {
    MediaLibrary mediaLibrary;
    public List<MediaItem> rentedItems = new ArrayList<MediaItem>();
    private String name;
    private String surname;
    private int idNumber;


    public User(MediaLibrary mediaLibrary, String name, String surname, int idNumber) {
        this.mediaLibrary = mediaLibrary;
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;

    }

}