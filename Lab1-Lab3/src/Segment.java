public class Segment
{
    private Vec2 startPoint;
    private Vec2 endPoint;

    public Segment(Vec2 startPoint, Vec2 endPoint)
    {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public Vec2 getStartPoint() {return startPoint;}
    public Vec2 getEndPoint() {return endPoint;}

    /* Usunięte mutatory (settery) tak jak chciało zadanie:
    public void setStartPoint(Vec2 startPoint)
    {
        this.startPoint = startPoint;
    }
    public void setEndPoint(Vec2 endPoint)
    {
        this.endPoint = endPoint;
    }
     */


    public double getLength()
    {
        int dx = endPoint.getX() - startPoint.getX();
        int dy = endPoint.getY() - startPoint.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }
    public String toSvg()
    {
        String code = "\n\t";
        code += "<line";
        code += "\n\t\t";   // \t - tabulacja
        code += "x1=\" "+ startPoint.getX() + "\"";
        code += "\n\t\t";
        code += "x1=\" "+ startPoint.getY() + "\"";
        code += "\n\t\t";
        code += "x1=\" "+ endPoint.getX() + "\"";
        code += "\n\t\t";
        code += "x1=\" "+ endPoint.getY() + "\"";
        code += "\n\t\t";
        code += "/>";

        return code;
    }

    public static Segment perpendicularSegment(Segment segment, Vec2 point)
    {
        int dx = segment.getEndPoint().getX() - segment.getStartPoint().getX();
        int dy = segment.getEndPoint().getY() - segment.getStartPoint().getY();
        int newX = point.getX() - dy;
        int newY = point.getY() + dx;
        Vec2 newEndPoint = new Vec2(newX, newY);

        return new Segment(point, newEndPoint);
    }

    public static Segment[] perpendicularSegmentsArray(Segment segment, Vec2 point)
    {
        int dx = segment.getEndPoint().getX() - segment.getStartPoint().getX();
        int dy = segment.getEndPoint().getY() - segment.getStartPoint().getY();
        int newX1 = point.getX() - dy;
        int newY1 = point.getY() + dx;
        int newX2 = point.getX() + dy;
        int newY2 = point.getY() - dx;
        Vec2 newEndPoint1 = new Vec2(newX1, newY1);
        Vec2 newEndPoint2 = new Vec2(newX2, newY2);


        if (newEndPoint1.getX() != point.getX() || newEndPoint1.getY() != point.getY()) //conajmniej jedna wspolrzedna ma sie roznic
        {
            Segment perpendicular1 = new Segment(point, newEndPoint1);
            Segment perpendicular2 = new Segment(point, newEndPoint2);
            return new Segment[]{perpendicular1, perpendicular2};
        } else
        {
            return new Segment[0];
        }
    }
}