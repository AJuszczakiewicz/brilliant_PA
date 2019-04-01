package tests;

import controller.ApplicationController;
import model.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ApplicationControllerTest {
    static Metadata bookMedia = new Metadata();
    static MediaItem book = new BookModel(12, "Other songs", true, bookMedia);
    static MediaItem film = new FilmModel(12, "Other songs", true, bookMedia);
    static UserModel menager = new ManagerModel("Adam", "The Mentor", 1);
    static ApplicationModel model = new ApplicationModel();
    static ApplicationController app = new ApplicationController(model);
    static UserModel client = new ClientModel("Paweł", "Paweł", 2);
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void addItem() {
        app.addItem(menager, book);
        MediaItem foundItem = app.findItem("Other songs");
        assertEquals(book, foundItem);
    }

    @Test
    public void removeExistingItem() {
        app.removeItem(menager, book);
        assertFalse(app.getData().getMediaItemsData().contains(book));
    }

    @Test
    public void clientCannotAddNewItemAndMessageIsDisplayed() {
        app.addItem(client, book);
        assertFalse(app.getData().getMediaItemsData().contains(book));
        assertEquals("Permission denied.", systemOutRule.getLog());
    }

    @Test
    public void removingNonExistingItemDisplayErrorMessage() {
    }


}