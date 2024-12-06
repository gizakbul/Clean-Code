package model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data // Getter, Setter, toString, equals, hashCode sağlar
public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }
}
