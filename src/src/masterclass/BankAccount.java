package masterclass;

public class BankAccount {
    private String accountNum;
    private double balance;
    private String customer;
    private String email;
    private String phone;

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double depositAmount) {
        this.balance+= depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed, current balance is now: " + balance);
    }

    public void withdrawFunds(double withdrawal) {
        if (balance - withdrawal < 0) {
            System.out.println("Only " + balance + " dollars available. Not processed");
        } else {
            this.balance-= withdrawal;
            System.out.println("Withdrew " + withdrawal + " dollars. Remaining balance: " + balance);
        }


    }
        //constructors
    public BankAccount() {
        this("Default-555-5555", 5.00, "Default name", "Default@gmail.com", "12345");
        System.out.println("empty constructor call");
    }

    public BankAccount(String phone, double balance, String customer, String email, String accountNum) {
        this.phone = phone;
        this.balance = balance;
        this.customer = customer;
        this.email = email;
        this.accountNum = accountNum;
        System.out.println("Full param constructor call");
    }




}
