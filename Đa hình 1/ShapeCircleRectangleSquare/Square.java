public class Square extends Rectangle {
    public Square(){}

    public Square(double side) {
        width = length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
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

    @Override
    public String toString() {
        return "Square[side="
            + width + ",color="
            + color + ",filled="
            + filled + "]";
    }

}
