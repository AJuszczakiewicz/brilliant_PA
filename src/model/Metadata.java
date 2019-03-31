package model;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Metadata {


    private String author;
    private String pages;
    private String duration;
    private String band;
    private String director;

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = String.valueOf(pages);
        } else {
            System.out.println("Illegal argument. Pls enter number above 0");
        }
    }

    public void setDuration(int duration) {
        if (duration > 0) {
            this.pages = String.valueOf(pages);
        } else {
            System.out.println("Illegal argument. Pls enter number above 0");
        }
    }

    public void setBand(String band) {
        this.band = band;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private Map<String, Object> getFieldNamesAndValues(boolean notNullOnly)
            throws IllegalArgumentException, IllegalAccessException {
        Class<? extends Object> c1 = this.getClass();
        Map<String, Object> map = new HashMap<>();
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            if (notNullOnly) {
                if (field.get(this) != null) {
                    Object value = field.get(this);
                    map.put(name, value);
                }
            } else {
                field.setAccessible(true);
                Object value = field.get(this);
                map.put(name, value);
            }
        }
        return map;
    }

    public Map<String, Object> getFieldsInMap() {
        Map<String, Object> map = new HashMap<>();
        try {
            map = this.getFieldNamesAndValues(true);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
        return map;
    }

    @Override
    public String toString() {
        StringBuilder metadata = new StringBuilder();
        try {
            Map<String, Object> map = this.getFieldNamesAndValues(true);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                metadata.append("\n");
                metadata.append(entry.getKey());
                metadata.append(" : ");
                metadata.append(entry.getValue());
            }
            return metadata.toString();
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
        return null;
    }
}
