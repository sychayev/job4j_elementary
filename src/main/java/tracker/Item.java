package tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created;

    public void Time(LocalDateTime created) {
        this.created = created;
    }

    public void Formatter() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern
                ("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String feedbackDateTimeFormatter = dateTime.format(formatter);
        System.out.println(feedbackDateTimeFormatter);
    }

    public LocalDateTime getCreated() {
        return created = LocalDateTime.now();
    }

    public Item() {

    }

    public Item(int id) {
        this.id = id;

    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }


}
