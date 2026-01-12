// package target.test_classes;

public class Cylinder extends Circle {
    private double height;

    /* 
     * bla.
     */
    public Cylinder() {
        super();
        this.height = 0.0;
    }

    /* 
     * bla.
     */
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    /* 
     * bla.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /* 
     * bla.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /* 
     * bla.
     */
    public double getHeight() {
        return this.height;
    }

    /* 
     * bla.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /* 
     * bla.
     */
    public double getVolume() {
        return super.getArea() * this.height;
    }

    /** 
     * toString method.
     */
    public String toString() {
        return "Cylinder["
             + super.toString() 
             + ",height=" 
             + this.height 
             + "]";
    }

    /* 
     * bla.
     */
    public double getArea() {
        return super.getArea() * 2 
               + 2 * PI * super.getRadius() * this.height;
    }

}
