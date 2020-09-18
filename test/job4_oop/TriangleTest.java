package job4_oop;

import job4_oop.src.Point;
import job4_oop.src.Triangle;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

    @org.junit.Test
    public void period() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }
}