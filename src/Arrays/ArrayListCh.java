package Arrays;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.Scanner;

public class ArrayListCh {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");


    public static void main(String[] args) {

    //implemenet the 'Options:' menu items
    boolean quit = false;
    startPhone();
    printActions();
    while(!quit) {
        System.out.println("\nEnter action: (6 to show available actions)");
        int action = scanner.nextInt();
        scanner.nextLine(); // clear ghost

        switch (action) {
            case 0:
                System.out.println("\nShutting down...");
                quit = true;
                break;
            case 1:
                mobilePhone.printContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                updateContact();
                break;
            case 4:
                removeContact();
            case 5:
                queryContact();
                break;
            case 6:
                printActions();
                break;
        }
    }

}

//methods----
    private static void addNewContact() {
        System.out.println("Enter new contact name:" );
        String name = scanner.nextLine();
        System.out.println("Enter phone #: ");
        String phone = scanner.nextLine();

        //now create the new contact. referencing the class, not obj. "factory method"
        Contact newContact = Contact.createContact(name, phone);
        //now can pass this on to addNewContact in MobilePhone class
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone # = " + phone); //prints if added to list
        } else {
            System.out.println("Cannot add " + name + " -- already on file."); //prints if not added
        }

    }

//    private static void printContacts() {
//
//        //Q: should do this here, or in MobilePhone?
////        System.out.println("Contact List");
////        for (int i = 0; i < mobilePhone.ge; i++) {
////
////        }
//        mobilePhone.printContacts(); JUST USE THIS IN CALL STACK INSTEAD
//    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

//        mobilePhone.queryContact(Contact contact)
//       ^ dont want this vers. make a method that accepts just the name and returns its entire record
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found.");
            return; //return null if not found
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone #: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);

        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error -- couldn't update record");
        }
    }

    private static void removeContact() {
        //copy-past first part of updateContact
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return; //return null if not found
        }

        //if here, know it exists
        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successful deletion.");
        } else {
            System.out.println("Error -- couldn't delete contact");
        }
    }

    private static void queryContact() {
        //copy-past first part of updateContact ->  //copy past removeContact
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        //will use the name to determine phone #?

        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone # is " + existingContactRecord.getPhoneNumber());
        //if here, know it exists

    }



    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("""
                0 - to shutdown
                1 - to print contacts
                2 - to add new contact
                3 - to update a contact4 - to remove a contact
                5 - search for an existing contact
                6 - to print a list of available actions.""");
        //going to use a switch for each case
        System.out.println("Choose your action: ");


    }

}