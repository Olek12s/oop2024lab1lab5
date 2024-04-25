public class ShapeDecorator implements Shape
{
    protected Shape shape;

    public ShapeDecorator(Shape shape)
    {
        this.shape = shape;
    }

    public String toSvg()
    {
        return shape.toSvg();
    }
}
