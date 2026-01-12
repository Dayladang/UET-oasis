
public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * bla.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        if (getArea() == 0 || p1 == null || p2 == null || p3 == null) {
            throw new RuntimeException();
        }
    }

    /* 
     * bla.
     */
    public Point getP1() {
        return p1;
    }

    /* 
     * bla.
     */
    public Point getP2() {
        return p2;
    }

    /* 
     * bla.
     */
    public Point getP3() {
        return p3;
    }

    /**
     * bla.
     */
    public double getArea() {
        return Math.abs(
            p1.getPointX() * (p2.getPointY() - p3.getPointY())
          + p2.getPointX() * (p3.getPointY() - p1.getPointY())
          + p3.getPointX() * (p1.getPointY() - p2.getPointY()) 
        ) / 2;
    }

    /*
     * bla.
     */
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * bla.
     */
    public String getInfo() {
        return "Triangle["
            + "(" + String.format("%.2f", p1.getPointX()) + "," 
                + String.format("%.2f", p1.getPointY()) + "),"
            + "(" + String.format("%.2f", p2.getPointX()) + "," 
                + String.format("%.2f", p2.getPointY()) + "),"
            + "(" + String.format("%.2f", p3.getPointX()) + "," 
                + String.format("%.2f", p3.getPointY()) + ")" 
            + "]";
    }
}
