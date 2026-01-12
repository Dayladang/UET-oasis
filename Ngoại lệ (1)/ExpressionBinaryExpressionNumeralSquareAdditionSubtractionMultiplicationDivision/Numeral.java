public class Numeral extends Expression {
    private double value;

    public Numeral() {}

    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Function.
     */
    public String toString() {
        if (value == (long) value) {
            return  String.format("%d", (long) value);
        } else {
            return "" + value + "";
        }
    }

    public double evaluate() {
        return value;
    }
}
