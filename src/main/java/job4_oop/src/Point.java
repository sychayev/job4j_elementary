package job4_oop.src;

public class Point {
    private int x;
    private int y;
    public Point (int first,int second){
        this.x = first;
        this.y = second;
    }

    public double distance(Point that){
        return Math.sqrt(Math.pow(this.x - that.x,2)
                + Math.pow(this.y - that.y,2));
    }

    public static void main(String[] args) {

    }
}
