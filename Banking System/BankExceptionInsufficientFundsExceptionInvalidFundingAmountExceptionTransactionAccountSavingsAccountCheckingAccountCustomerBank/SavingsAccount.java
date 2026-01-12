
public class SavingsAccount extends Account {
    /**
     * bla.
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * bla.
     */
    @Override
    public void withdraw(double amount) {
        try {
            if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        }
        if (amount > 1000.0) {
            throw new BankException("Số tiền rút tối đa cho tài khoản tiết kiệm là $" 
                                    + String.format("%.2f", 1000.0));
        }
        if (balance - amount < 5000.0) {
            throw new InsufficientFundsException(amount);
        }

            double balance1 = balance;
            super.doWithdrawing(amount);
            double balance2 = balance;
            Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
                                                amount, balance1, balance2);
            addTransaction(transaction);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * bla.
     */
    @Override
    public void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new InvalidFundingAmountException(amount);
            }

            double balance1 = balance;
            doDepositing(amount);
            double balance2 = balance;
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                    amount, balance1, balance2);
            addTransaction(transaction);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}
