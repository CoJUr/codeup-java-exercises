package masterclass.AutoboxingandUnboxing;

//creating customer first because its used pretty much everywhere

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    // constructor which inits with a customer's name and the transaction amount theyre starting the accnt with at this branch
    public Customer(String name, double initialAmount) {
        this.name = name;

        //returning back to the initialization accnt balance, can call the addTransaction method. first, initialize the field
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
        //now adds that to the arraylist of transactions

    }

    //need mechanism to store returning customers transactions in the arraylist
    public void addTransaction(double amount) {
        this.transactions.add(amount); //converting from a primitive to the object wrapper, aka Autoboxing
    }
    //logical to have functionality to add customers' transaction to the objects class
    //because changes to the fields should be done in-class

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
