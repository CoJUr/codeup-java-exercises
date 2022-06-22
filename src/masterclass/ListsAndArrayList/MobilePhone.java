package masterclass.ListsAndArrayList;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber; //option to store mobile phone #
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        //should also init the ArrayList here because using the AL in the class
        this.myContacts = new ArrayList<Contact>(); //empty list creator
    }


    //add new contacts using a public method, checking if contact already exists
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            //returns false if it was already on file
            System.out.println("Contact already on file");
            return false;

        } else {
            myContacts.add(contact); //contact here contains details: name + phone#
            return true;
        }

    }



    public boolean updateContact(Contact oldContact, Contact newContact){
        //searching for old contact, going to update it to newContact to replace old with new
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) { //confirming name of contact doesnt already exist
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update not successful.");
            return false;
        }
        //if here, name wasn't found, so do perform update
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        //copy past all code from updateContact
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        //if it was found:
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    //2 overloaded findContact methods. 1 returns index position for editing ArrayList purposes
    //the other we pass the name for it to find in the list
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact); //returns the index of the contact El
        //if doesn't exist, returns a negative num
    }

    private int findContact(String contactName) {
        //loop thru all records, extract name out and compare it to the passed name
        //return the indexed position (if its on file)
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            //creating a new Contact obj for the found item in the list
            if (contact.getName().equals(contactName)) {
                return i; //getting its position# so we can update it in modify method or add new contact
            }

        }
        return -1;
    }

    //make one more finder, this one returns data as a string rather than int
    //making these private because dont want other classes to get the int of our arrays
    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            //calling 1st overloaded findContact to see if contact on file
            return contact.getName();
        }
        else {
            return null;
            //this would mean it didnt exist
        }
    }

    public Contact queryContact(String name) {
        //look for any record matching the name and return its contents for updateContact(). can just use findContact(name)
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." + this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
            //goes through the list of array el's and prints them out.

            //shouldn't have been in main class's printContacts() bc had to navigate index positions and print #s
            //dont want that class calling the MobilePhone code to know how the underlying ArrayList works
        }
    }




}
