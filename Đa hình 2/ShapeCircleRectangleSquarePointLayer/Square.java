import java.util.Objects;

public class Square extends Rectangle {
    public Square(){}

    public Square(double side) {
        width = length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    @Override
    public void setWidth(double side) {
        width = length = side;
    }

    @Override
    public void setLength(double side) {
        width = length = side;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = length = side;
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
        Square other = (Square) o;
        if (Math.abs(this.width - other.width) > 0.001) {
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
        return "Square[topLeft="
            + topLeft.toString() + ",side="
            + width + ",color="
            + color + ",filled="
            + filled + "]";
    }

}
