import java.util.List;

public class Polygon
{
    private List<Point> points;

    Polygon(List<Point> points)
    {
        this.points = points;
    }

    public boolean inside(Polygon poly, Point point)
    {
        int counter = 0;
        for (int i = 0; i < points.size() - 1; i++)
        {
            Point pa = points.get(i);
            Point pb = points.get(i + 1);

            if (pa.y > pb.y)
            {
                Point tempPa = pa;
                pa = pb;
                pb = tempPa;
            }
            if (pa.y < point.y && point.y < pb.y)
            {
                float d = pb.x - pa.x;
                float x;
                if (d == 0)
                {
                    x = pa.x;
                }
                else
                {
                    float a = (pb.y - pa.y) / d;
                    float b = pa.y - a * pa.x;
                    x = (point.y - b) / a;
                }
                if (x < point.x)
                {
                    counter++;
                }
            }
        }
        if (counter % 2 == 0) return false; // jeśli nieparzysty zwróć fałsz
        else return true;  // jesli parzysty zwróc true;
    }
}
