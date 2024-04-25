public class Style
{
    private String fill;
    private String stroke;
    double strokeWidth;

    public Style(String fill, String stroke, double strokeWidth)
    {
        this.fill = fill;
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
    }

    public Style(Style styleToCopy)     // kopia płytka
    {
        this.fill = styleToCopy.getFill();
        this.stroke = styleToCopy.getStroke();
        this.strokeWidth = styleToCopy.getStrokeWidth();
    }

    public String getFill() {return fill;}
    public String getStroke() {return stroke;}
    public double getStrokeWidth() {return strokeWidth;}
    public void setFill(String fill) {this.fill = fill;}
    public void setStroke(String stroke) {this.stroke = stroke;}
    public void setStrokeWidth(double strokeWidth) {this.strokeWidth = strokeWidth;}

    String toSvg()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(" style=\"fill:");
        sb.append(getFill());
        sb.append(";");
        sb.append("stroke:");
        sb.append(getStroke());
        sb.append(";");
        sb.append("stroke-width:");
        sb.append(getStrokeWidth());
        sb.append(";");
        sb.append("\"");

        return sb.toString();
    }
}
