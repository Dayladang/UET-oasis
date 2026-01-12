// package target.test_classes;

public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private double radius;
    private Point center;

    /*
     * bla.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /*
     * bla.
     */
    public Point getCenter() {
        return center;
    }

    /*
     * bla.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /* 
     * bla.
     */
    public double getRadius() {
        return radius;
    }

    /* 
     * bla.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*
     * bla.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /*
     * bla.
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * bla.
     */
    public String getInfo() {
        return "Circle[(" + String.format("%.2f", center.getPointX()) + ","
                          + String.format("%.2f", center.getPointY()) + "),"
                          + "r=" + String.format("%.2f", radius) + "]";
    }

}
