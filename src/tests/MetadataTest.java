package tests;

import model.Metadata;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class MetadataTest {

    @Test
    public void toStringShouldNotBeNullMapWhenNoFieldsWereSet() {
        Metadata metadata = new Metadata();
        assertNotNull(metadata);
    }

    @Test
    public void toStringShouldBeEmptyStringWhenNoFieldsWereSet() {
        Metadata metadata = new Metadata();
        System.out.println(metadata.toString());
        assertEquals("", metadata.toString());
    }

    @Test
    public void toStringWithOnlyOneField() {
        Metadata metadata = new Metadata();
        metadata.setPages(23);
        assertEquals("\npages : 23", metadata.toString());

    }

    @Test
    public void toStringWithTwoFields() {
        Metadata metadata = new Metadata();
        metadata.setPages(23);
        metadata.setBand("Offspring");
        String expectedString = "\npages : 23\nband : Offspring";
        assertEquals(expectedString, metadata.toString());
    }
}