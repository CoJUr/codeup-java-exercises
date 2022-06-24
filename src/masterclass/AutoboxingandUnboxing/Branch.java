package masterclass.AutoboxingandUnboxing;

import java.util.ArrayList;

//adding new customers with initial transaction amt, and additional transactions for the customer/branch
public class Branch {

    private String name;
    //storing a list of customers in the branch. could have a seperate list of customers for each branch
    private ArrayList<Customer> customers;

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        //init the array list
        this.customers = new ArrayList<Customer>();
    }

    //want to be able to show the branch name on screen
    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        //using boolean because could fail if pass a customer name that alrdy exists,
        //so wouldn't want to add the customer to the list
        //need a find customer method to test if name in use
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
                    //if not found on file, constructing and adding the customer
            return true;
        }
        //if here, findCustomer returned a customer, so don't add them
        return false;
    }


    //addTransactions will be opposite newCustomer; if not on file return false because
    //cant add a transaction to a customer that doesn't exist
    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        //doing this to avoid calling findCustomer a 2nd time and because will use the obj in a test

        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false; //because didn't find a customer
    }

    //findCustomers will only be performed internally in the branch-class, so private mod
    private Customer findCustomer(String customerName) {
        //loop thru arraylist of Customer records stored at this branch
        for (Customer checkedCustomer : this.customers) {
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null; // would mean no matches; not on file
    }



}
