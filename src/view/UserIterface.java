package view;

import model.MediaItem;
import model.UserModel;

public class UserIterface {
    public void showMenu() {
    }

    public void showItem(MediaItem item) {
        StringBuilder preview = new StringBuilder();
        preview.append("Title: %s");
        preview.append(item.getTitle());
        preview.append(item.getMetadata().toString());
        System.out.println(preview.toString());
    }

    public void showUser(UserModel user) {
    }

}
