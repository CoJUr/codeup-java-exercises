package masterclass.AutoboxingandUnboxing;


//	    // You job is to create a simple banking application.
//        // There should be a Bank class
//        // It should have an arraylist of Branches
//        // Each Branch should have an arraylist of Customers
//        // The Customer class should have an arraylist of Doubles (transactions)
//        // Customer:
//        // Name, and the ArrayList of doubles.
//        // Branch:
//        // Need to be able to add a new customer and initial transaction amount.
//        // Also needs to add additional transactions for that customer/branch
//        // Bank:
//        // Add a new branch
//        // Add a customer to that branch with initial transaction
//        // Add a transaction for an existing customer for that branch
//        // Show a list of customers for a particular branch and optionally a list
//        // of their transactions
//        // Demonstration autoboxing and unboxing in your code
//        // Hint: Transactions
//        // Add data validation.
//        // e.g. check if exists, or does not exist, etc.
//        // Think about where you are adding the code to perform certain actions
public class AutoAndUnBoxingCh {

    public static void main(String[] args) {


        Bank bank = new Bank("National Bank");

        //add a branch
        bank.addBranch("Adelaide");

        //add custos
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 75.34);
        bank.addCustomer("Adelaide", "Percy", 250.15);

        //create another branch
        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);


        //add transactions
        bank.addCustomerTransactions("Adelaide", "Tim", 44.22);
        bank.addCustomerTransactions("Adelaide", "Tim", 14.42);
        bank.addCustomerTransactions("Adelaide", "Mike", 1.59);

        //test the bank. false first to not show transactions
        bank.listCustomers("Adelaide", false);


    }
}
