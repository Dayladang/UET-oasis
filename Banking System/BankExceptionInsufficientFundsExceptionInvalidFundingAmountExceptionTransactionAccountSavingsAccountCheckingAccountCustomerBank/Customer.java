import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    /**
     * bla.
     */
    public Customer() {}

    /**
     * bla.
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * bla.
     */
    public String getCustomerInfo() {
        return "Số CMND: " + this.idNumber + ". Họ tên: " + this.fullName + ".";
    }

    /**
     * bla.
     */
    public void addAccount(Account account) {
        if (account != null) {
            this.accountList.add(account);
        }
    }

    /**
     * bla.
     */
    public void removeAccount(Account account) {
        this.accountList.remove(account);
    }

    /**
     * bla.
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * bla.
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * bla.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * bla.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * bla.
     */
    public List<Account> getAccountList() {
        return accountList;
    }
}