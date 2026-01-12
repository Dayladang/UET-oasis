import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * bla.
     */
    public void readCustomerList(InputStream inputStream) {
        try {
            InputStreamReader input = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(input);
            String readLine;
            while ((readLine = reader.readLine()) != null) {
                String[] tmpStringArray = readLine.split(" ");
                if (Character.isLetter(tmpStringArray[0].charAt(0))) {
                    long number = Long.parseLong(tmpStringArray[3]);
                    String fullName = String.join(" ", tmpStringArray[0],
                                               tmpStringArray[1], tmpStringArray[2]);

                    customerList.add(new Customer(number, fullName));
                } else {
                    long number = Long.parseLong(tmpStringArray[0]);
                    String accountType = tmpStringArray[1];
                    double balance = Double.parseDouble(tmpStringArray[2]);
                    Account account;

                    if (accountType.equals("SAVINGS")) {
                        account = new SavingsAccount(number, balance);    
                    } else {
                        account = new CheckingAccount(number, balance);
                    }

                    customerList.get(customerList.size() - 1).addAccount(account);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * bla.
     */
    public String getCustomersInfoByNameOrder() {
        customerList.sort(Comparator.comparing(Customer::getFullName));

        String result = "";
        for (Customer c : customerList) {
            result += c.getCustomerInfo();
            result += "\n";
        }
        return result;
    }

    /**
     * bla.
     */
    public String getCustomersInfoByIdOrder() {
        customerList.sort(Comparator.comparing(Customer::getIdNumber));

        String result = "";
        for (Customer c : customerList) {
            result += c.getCustomerInfo();
            result += "\n";
        }
        return result;
    }

    /**
     * bla.
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }
}
