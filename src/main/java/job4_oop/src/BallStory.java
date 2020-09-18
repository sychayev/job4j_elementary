package job4_oop.src;

public class BallStory {
    public static void main(String[] args) {
        System.out.println("This is a story about adventure the ball!!");
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Ball bal = new Ball();
        Fox fox = new Fox();
        hare.tryEat(bal);
        bal.tryEat(bal);
        wolf.tryEat(bal);
        bal.tryEat(bal);
        fox.tryEat(bal);

    }
}
