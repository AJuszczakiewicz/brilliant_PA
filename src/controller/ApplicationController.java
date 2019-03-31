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

    public void addItem(UserModel user, MediaItem item) {
        if (user.getClass().equals(ManagerModel.class)) {
            data.addMediaItem(item);
        }
        view.showMenu();
    }

    public void removeItem(UserModel user, MediaItem item) {
        if (user.getClass().equals(ManagerModel.class)) {
            data.addMediaItem(item);
        }
    }

    public String displayItem(String keyword) {
        MediaItem media = data.searchForItem(keyword);
        return media.toString();
    }
}
