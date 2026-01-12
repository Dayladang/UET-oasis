// package target.test_classes;

public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14;

    /* 
     * Contructor. 
     */
    public Circle() {
        this.radius = 0.0;
        this.color = "black";
    }

    /*
     * bla.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /* 
     * bla.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
    public String getColor() {
        return color;
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
    public void setColor(String color) {
        this.color = color;
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
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

}
