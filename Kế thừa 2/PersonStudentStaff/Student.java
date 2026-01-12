// package target.test_classes;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * bla.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * bla.
     */
    public String getProgram() {
        return program;
    }

    /**
     * bla.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * bla.
     */
    public int getYear() {
        return year;
    }

    /**
     * bla.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * bla.
     */
    public double getFee() {
        return fee;
    }

    /**
     * bla.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * bla.
     */
    @Override
    public String toString() {
        return "Student[" + super.toString() 
            + ",program=" + program 
            + ",year=" + year 
            + ",fee=" + fee + "]";
    }
}
