import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point newPoint) {
        return Math.sqrt((this.pointX - newPoint.pointX) * (this.pointX - newPoint.pointX) 
                       + (this.pointY - newPoint.pointY) * (this.pointY - newPoint.pointY));
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
        Point other = (Point) o;
        
        return Math.abs(this.pointX - other.pointX) <= 0.001
            && Math.abs(this.pointY - other.pointY) <= 0.001;
    }

    /**
     * bla.
     */
    public int hashCode() {
        return Objects.hash(
            Math.round(pointX * 1000),
            Math.round(pointY * 1000)
        );
    }

    /**
     * bla.
     */
    public String toString() {
        pointX = Math.round(pointX * 10.0) / 10.0;
        pointY = Math.round(pointY * 10.0) / 10.0;
        return "(" + pointX + "," + pointY + ")";
    }
}
