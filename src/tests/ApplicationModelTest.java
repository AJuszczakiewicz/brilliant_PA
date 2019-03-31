package tests;

import model.ApplicationModel;
import model.BookModel;
import model.MediaItem;
import model.Metadata;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationModelTest {

    @Test
    public void addsOneMediaItem() {
        ApplicationModel model = new ApplicationModel();
        Metadata mediadata = new Metadata();
        MediaItem book = new BookModel(1, "Test", true, mediadata);
        model.addMediaItem(book);
        MediaItem firstItem = model.getMediaItemsData().get(0);
        assertEquals("Array size is upgraded", 1, model.getMediaItemsData().size());
        assertEquals("First item in array is added item", book, firstItem);
    }

}