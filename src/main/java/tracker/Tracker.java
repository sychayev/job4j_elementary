package tracker;

import java.awt.*;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;

    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }
    public Item[] findByName(String key) {
        Item it = new Item();
        int[] mas = new int[items.length];
        for (int i = 0; i < mas.length; i++) {
            if (it.getName() != key) {
            }
        }
        return Arrays.copyOf(items, size);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
