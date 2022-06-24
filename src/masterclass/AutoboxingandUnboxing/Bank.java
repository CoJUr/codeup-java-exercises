package masterclass.AutoboxingandUnboxing;

import java.util.ArrayList;

public class Bank {
    private String bank;
    private ArrayList<Branch> branches;
    //arraylist of branches bc a bank can have multiple branches

    public Bank(String bank, ArrayList<Branch> branches) {
        this.bank = bank;
        this.branches = new ArrayList<Branch>();
    }

    public Bank(String bank) {
        this.bank = bank;
    }

    //add branches similar to how added customers
//    public boolean addBranch (String branchName) {
//        if (findBranch(branchName == null)) {
//            this.branches.add(new Branch(branchName));
//            //calling the branch constructor, passing it the name
//            return true;
//        }
//        //if here, can't add it to the list bc already exists
//        return false;
//    }

    //adding customers - when adding customers, need to specify a branch along with
    //customer name and initial transaction. check to see if the branch exists first.
    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
            if (branch != null) {
                //can only add a customer if the branch exists
                return branch.newCustomer(customerName, initialAmount);
                //newCustomer is what adds customers and then returns true
            }
            return false;
    }

    //adding transactions
    public boolean addCustomerTransactions(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName); //verify it exists first
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    //copy pasta from branch's findCustomer(), a few changes
    //searching for passed in branch name in current list. if found, return it
    private Branch findBranch(String branchName) {
        //loop thru arraylist of Customer records stored at this branch
        for (Branch checkedBranch : this.branches) {
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null; // would mean no matches; not on file
    }



    //show a list of customers for a specific branch, and a list of their transactions
    public boolean listCustomers (String branchName, boolean showTransactions) {
        //showTransactions will be false if only want custo names; true if want list of transactions
    Branch branch = findBranch(branchName);
    if (branch != null) {
        System.out.println("Customer details for branch " + branch.getName() + ":");

        //get a list of custos of the branch we just retrieved from searching. loop thru it
        ArrayList<Customer> branchCustomers = branch.getCustomers();
        for (int i = 0; i < branchCustomers.size(); i++) {
            Customer branchCustomer = branchCustomers.get(i);
            //^to avoid repeating code
            System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
            //^showing customer name
            if (showTransactions) {
                //show that custo's transactions if showTransactions = true
                System.out.println("Transactions");
                ArrayList<Double> transactions = branchCustomer.getTransactions();
                //now another loop thru the transactions to print each one out, + [transaction #]
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j+1) + "]  Amount "
                            + transactions.get(j) ) ; //unboxing
                }
            }

        }
        return true;
    } else {
        return false; //would indicate error - like couldn't find branch
    }


    }


}
