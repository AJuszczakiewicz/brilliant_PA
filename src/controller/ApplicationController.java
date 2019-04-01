package controller;


import model.ApplicationModel;
import model.ManagerModel;
import model.MediaItem;
import model.UserModel;
import view.UserIterface;

public class ApplicationController {

    private UserIterface view = new UserIterface();
    private ApplicationModel data;

    public ApplicationController(ApplicationModel model) {
        this.data = model;
    }

    public void login(String login, String password) {
        UserModel user = data.searchForUser(login);
        // check if user exist and if password is correct
        view.showUser(user);
    }

    public ApplicationModel getData() {
        return data;
    }

    public void addItem(UserModel user, MediaItem item) {
        if (user instanceof ManagerModel) {
            // instanceOf
            data.addMediaItem(item);
        } else {
            System.out.print("Permission denied.");
        }
    }

    public void removeItem(UserModel user, MediaItem item) {
        if (user instanceof ManagerModel) {
            data.removeMediaItem(item);
        }
    }

    public String displayItem(String keyword) {
        MediaItem media = data.searchForItem(keyword);
        return media.toString();
    }

    public MediaItem findItem(String keyword) {
        MediaItem media = data.searchForItem(keyword);
        return media;
    }
}
