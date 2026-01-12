import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    /**
     * Function.
     */
    public Account() {
        this.balance = 0.0;
        this.transitionList = new ArrayList<>();
    }

    /**
     * Function.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += amount;
        transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
    }

    /**
     * Function.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        balance -= amount;
        transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
    }

    /**
     * Function.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equalsIgnoreCase(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equalsIgnoreCase(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Function.
     */
    public void printTransaction() {
        int i = 1;
        for (Transaction t : transitionList) {
            String action = t.getOperation()
                             .equalsIgnoreCase(Transaction.DEPOSIT) ? "Nap tien" : "Rut tien";
                             
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.%n",
                    i++, action, t.getAmount(), t.getBalance());
        }
    }
}
