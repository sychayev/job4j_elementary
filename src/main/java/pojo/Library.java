package pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 5);
        Book book2 = new Book("Space", 7);
        Book book3 = new Book("Moon", 3);
        Book book4 = new Book("Ocean", 9);
        Book[] cycle = new Book[4];
        cycle[0] = book1;
        cycle[1] = book2;
        cycle[2] = book3;
        cycle[3] = book4;

        for (int i = 0; i < cycle.length; i++) {
            Book b = cycle[i];
            System.out.println(b.getName() + " - " + b.getQuantityPages());
        }
        System.out.println("List with a name book Clean code!!");
        for (int i = 0; i < cycle.length; i++) {
            Book bk = cycle[0];
            System.out.println(bk.getName() + " - " + bk.getQuantityPages());
        }
        System.out.println("Changing place books! ");
        cycle[0] = book4;
        cycle[3] = book1;
        for (int i = 0;i < cycle.length;i++){
            Book b = cycle[i];
            System.out.println(b.getName() + " " + b.getQuantityPages());
        }
    }
}
