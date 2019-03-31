package controller;

import model.ApplicationModel;
import view.UserIterface;

public class Main {
    public static void main(String[] args) {
        ApplicationModel model = new ApplicationModel();
        ApplicationController app = new ApplicationController(model);
        UserIterface gui = new UserIterface();
        gui.showMenu();
    }
}
