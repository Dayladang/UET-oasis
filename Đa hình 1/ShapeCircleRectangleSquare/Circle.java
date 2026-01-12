// package target.test_classes;

public class Circle extends Shape {
    protected double radius;

    /* 
     * Contructor. 
     */
    public Circle() {}

    /*
     * bla.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /* 
     * bla.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
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

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" 
            + radius + ",color=" 
            + color + ",filled=" 
            + filled + "]";
    }

}
