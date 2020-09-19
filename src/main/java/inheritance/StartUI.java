package inheritance;

import tracker.Item;

public class StartUI extends Item {
    public static void main(String[] args) {
        Item i = new Item();
        System.out.println(i.getCreated());
    }
}
