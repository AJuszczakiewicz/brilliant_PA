package controller;

import data.MediaLibrary;
import model.Book;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test
    public void showMediaItem() {
        MediaLibrary library = new MediaLibrary();
        User user1 = new Client(library, "Alex", "Ines", 1);
        Book book1 = new Book("Java for Dummies", new Date(), true, "Adam");
        library.addMediaItem(book1);


        String book1Preview = "\nAuthor: " + "Adam" +
                "\nTitle: " + "Java for Dummies" +
                "\nAvailable: " + true;

        String itemPreview = ((Client) user1).showMediaItem("Java for Dummies");

        assertEquals(itemPreview, book1Preview);
    }
}