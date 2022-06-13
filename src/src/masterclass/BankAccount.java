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

//    public BankAccount(String customer, String email, String phone) {
//
//    }


}
