package job4_oop.src;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {

        return -1;
    }

    public boolean exist(double ab, double ac, double dc) {
        return false;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double ap = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {


            rsl = -1;
        }
    }

    public static void main(String[] args) {

    }
}
