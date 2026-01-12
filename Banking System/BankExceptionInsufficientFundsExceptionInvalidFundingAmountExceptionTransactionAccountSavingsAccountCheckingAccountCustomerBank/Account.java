import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    /**
     * bla.
     */
    public Account() {}

    /**
     * bla.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * bla.
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
    }

    /**
     * bla.
     */
    public void doDepositing(double amount) throws BankException {
        if (amount <= 0) { 
            throw new InvalidFundingAmountException(amount);
        }
        balance += amount;
    }

    /**
     * bla.
     */
    public abstract void withdraw(double amount);

    /**
     * bla.
     */
    public abstract void deposit(double amount);

    /**
     * bla.
     */
    public String getTransactionHistory() {
        String result = "Lịch sử giao dịch của tài khoản ";
        result += accountNumber;
        result += ":\n";
        for (Transaction t : transactionList) {
            result += t.getTransactionSummary();
            result += "\n"; 
        }
        return result;
    }

    /**
     * bla.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * bla.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Account)) {
            return false;
        }
        Account account = (Account) obj;
        return accountNumber == account.accountNumber;
    }
}
