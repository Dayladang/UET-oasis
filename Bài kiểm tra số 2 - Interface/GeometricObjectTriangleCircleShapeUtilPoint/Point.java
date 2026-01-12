public class Point {
    private double pointX;
    private double pointY;

    /*
     * bla.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /*
     * bla.
     */
    public double getPointX() {
        return pointX;
    }

    /*
     * bla.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /*
     * bla.
     */
    public double getPointY() {
        return pointY;
    }

    /*
     * bla.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /*
     * bla.
     */
    public double distance(Point other) {
        return Math.sqrt((this.pointX - other.pointX) * (this.pointX - other.pointX) 
                       + (this.pointY - other.pointY) * (this.pointY - other.pointY));
    }
}
