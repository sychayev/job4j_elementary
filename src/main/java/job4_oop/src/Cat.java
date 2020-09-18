package job4_oop.src;

public class Cat {
    private String food;
    private String name;
    public void givNick(String nick){
        this.name = nick;
        System.out.println(this.name);

    }
    public  void show(){
        System.out.println(this.food);

    }

    public void eat(String meat){
        this.food = meat;
    }
    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.givNick("Barsik eat fish");
        gav.eat("Kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.givNick("Persik eat bird");
        black.eat("Fish");
        black.show();

    }
}
