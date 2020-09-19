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

    public static double period(double a, double b, double c) {
        double prd = (a + b + c) / 2;
        return prd;
    }

    public static boolean exist(double ab, double ac, double bc) {
        boolean ex = true;
        boolean a = ab < bc + ac;
        boolean b = ac < ab + bc;
        boolean c = bc < ab + ac;
        if ((a != b) && (b != c) && (a != c)) {
            ex = false;
        }
        return ex;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double ap = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(ap * (ap - ab) * (ap - ac) * (ap - bc));
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(Triangle.period(0, 4, 4));
        System.out.println(Triangle.exist(0, 4, 4));
    }
}
