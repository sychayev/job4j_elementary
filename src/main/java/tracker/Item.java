package tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created;
    public void Time(LocalDateTime created){
        this.created = created;
    }

    public  LocalDateTime getCreated() {

        return created = LocalDateTime.now();
    }

    public Item(){

    }
    public Item(int id){
        this.id = id;

    }
    public Item(int id ,String name){
        this.id = id;
        this.name = name;
    }

}
