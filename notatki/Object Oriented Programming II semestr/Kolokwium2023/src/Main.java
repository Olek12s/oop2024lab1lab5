import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(50, 0);
        Point pointC = new Point(50, 50);
        Point pointD = new Point(0, 50);

        Point pointE = new Point(-3, -5);

        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        points.add(pointD);

        Polygon poly = new Polygon(points);
        System.out.println(poly.inside(poly, pointE));

    }
}