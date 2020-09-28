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
        int count =0;
       int[]rsl = new int[size];
        for (int i = items.length; i < size; i++) {
            if (items[i].getName().equals(key) ) {
                rsl[i] +=count;
                count++;
            }else if(i==count){
                break;
            }
        }
        return Arrays.copyOf(items, count);
    }

    public Item findById(int id) {
        int i = indexOf(id);
        return  i != -1 ? items[i] : null;
    }
}
