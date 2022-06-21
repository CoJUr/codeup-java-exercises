package masterclass.LinkedLists;

import java.util.ArrayList;

public class Main {

    //arrayLists: objects
    //arrays: ints doubles booleans, etc primitives

    //Linked list: array alternative. stores the 'link' of NEXT item in the list as well as data.
    //each El in the list holds the link to the item that follows

    public static void main(String[] args) {
        Customer customer = new Customer("tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " = " + customer.getBalance());
        //12.18 for both customer's balance. anotherCustomer isn't a separate object so updating it updates the other


        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }// 3 entries--  0:1   1:3   2:4

        intList.add(1, 2); //inserts the number '2' into index[1].

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        } //4 entries in the list--  0: 1  1:2   2:3   3: 4
    }   //to insert 2 into index[1] the rest of the items in the follow positions moved down 1 position
        //heres where LinkedLists would come in. take advantage of the daisy-chain of links

}
