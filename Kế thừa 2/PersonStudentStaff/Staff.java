// package target.test_classes;

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * bla.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * bla.
     */
    public String getSchool() {
        return school;
    }

    /**
     * bla.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * bla.
     */
    public double getPay() {
        return pay;
    }

    /**
     * bla.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * bla.
     */
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}