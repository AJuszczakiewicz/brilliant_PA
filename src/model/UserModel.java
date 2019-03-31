package model;

import java.util.List;

public class UserModel {
    private final int ID;
    public List<MediaItem> rentedItems;
    private String name;
    private String surname;


    public UserModel(String name, String surname, int ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public List<MediaItem> getRentedItems() {
        return rentedItems;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}