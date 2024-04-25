import java.util.ArrayList;

public class Polygon implements Shape {

    private ArrayList<Vec2> points;
    private Style style;

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Polygon(ArrayList<Vec2> points, Style style) {
       // super(style);
        this.points = points;
        this.style = style;
    }

    public Polygon(Polygon other) {
        this.style = new Style(other.getStyle());
        this.points = new ArrayList<>();
        for (Vec2 point : other.getPoints()) {
            this.points.add(new Vec2(point.getX(), point.getY()));
        }
    }

    public ArrayList<Vec2> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Vec2> points) {
        this.points = points;
    }

    @Override
    public String toSvg() {
        String code = "polygon points=\"";
        for (Vec2 p : points) {
            code += p.getX() + "," + p.getY() + " ";
        }
        code += "\"";
        code += getStyle().toSvg(); // Wywołanie metody toSvg() z klasy Style
        code += "\n";

        return code;
    }
}
