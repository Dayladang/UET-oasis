import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return this.width;
    } 

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
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
        Rectangle other = (Rectangle) o;
        if (Math.abs(this.width - other.width) > 0.001) {
            return false;
        }
        if (Math.abs(this.length - other.length) > 0.001) {
            return false;
        }
        if (this.topLeft == null) {
            return other.topLeft == null;
        }

        return this.topLeft.equals(other.topLeft);
    }

    /**
     * bla.
     */
    public int hashCode() {
        return Objects.hash(Math.round(width * 1000), 
                           Math.round(length * 1000), 
                           topLeft
        );
    }

    @Override
    public String toString() {
        width = Math.round(width * 10.0) / 10.0;
        length = Math.round(length * 10.0) / 10.0;
        return "Rectangle[topLeft="
            + topLeft.toString() + ",width="
            + width + ",length="
            + length + ",color="
            + color + ",filled="
            + filled + "]";
    }

}
