public class CheckingAccount extends Account {
    /**
     * bla.
     */
    public CheckingAccount(long accountNumber, double balance) {
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
            if (this.balance - amount < 0.0) {
                throw new InsufficientFundsException(amount);
            }

            double balance1 = balance;
            doWithdrawing(amount);
            double balance2 = balance;
            Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_CHECKING,
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
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_CHECKING,
                                                amount, balance1, balance2);
            addTransaction(transaction);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}
