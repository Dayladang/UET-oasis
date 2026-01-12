public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * Function.
     */
    public double evaluate() {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return left.evaluate() / right.evaluate();
    }
}
