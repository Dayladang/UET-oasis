// package target.test_classes;
import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

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

    /**
     * bla.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

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
        radius = Math.round(radius * 10.0) / 10.0;
        return "Circle[center="
            + center.toString() + ",radius=" 
            + radius + ",color=" 
            + color + ",filled=" 
            + filled + "]";
    }

    /**
     * bla.
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle other = (Circle) o;
        if (Math.abs(this.radius - other.radius) > 0.001) {
            return false;
        }
        if (this.center == null) {
            return other.center == null;
        } 
        return center.equals(other.center);
    }

    public int hashCode() {
        return Objects.hash(Math.round(radius * 1000), center);
    }

}
