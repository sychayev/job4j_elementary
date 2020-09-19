package tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;

    public Item(){

    }
    public Item(int id){
        this.id = id;

    }
    public Item(int id ,String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Item item = new Item();
    }
}
