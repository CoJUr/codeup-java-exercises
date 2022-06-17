package masterclass.ListsAndArrayList;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) { //continue until user decides to stop
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt(); // they select from a list of options of numbers
            scanner.nextLine(); // clear the ghost

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - to print choice options.");
        System.out.println("\t 1 - to print the list of groceries.");
        System.out.println("\t 2 - to add an item to the list.");
        System.out.println("\t 3 - to modify an item of the list.");
        System.out.println("\t 4 - to REMOVE and item from the list.");
        System.out.println("\t 5 - to search the list for an item.");
        System.out.println("\t 6 - to quit.");

    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine()); //whatever they type, add as an item

    }

    public static void modifyItem() {
        System.out.print("Enter item # to be modified: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine(); //clear the ghost
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo -1, newItem); //itemNo - 1 because 0 index
    }

    public static void removeItem() {
        System.out.print("Enter item # to be REMOVED: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine(); //clear the ghost
        groceryList.removeGroceryItem(itemNo -1); // note: no -1 here (causes out of bounds exception)
    }

    public static void searchForItem() {
        System.out.print("Enter the item you're looking for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null ) {
            System.out.println("Found " + searchItem + " in the list");
        } else {
            System.out.println(searchItem + " is not found in the list");
        }
    }




















//    private static Scanner s = new Scanner(System.in);
//    private static int[] baseData = new int[10];
//
//    //methods----
//    private static void getInput() {
//        //loop to get data from console and save it to the array
//        for (int i = 0; i < baseData.length; i++) {
//            baseData[i] = s.nextInt();
//        }
//    }
//
//    private static void printArray(int[] arr){
//        for (int j : arr) System.out.println(j + " ");
//            System.out.println();
//        //printing the contents of the array
//    }
//
//    private static void resizeArray(){
//        int[] original = baseData; //saves a copy of the original array
//
//        baseData = new int[12]; // then reinitialize with a new 12 item array
//        for (int i = 0; i < original.length; i++) {
//            //looping through each el of the original (copied) array and stores it into the new (reassigned) array. RESIZING
//            baseData[i] = original[i];
//        }
//    }
//
//    //-----
//    public static void main(String[] args) {
//        System.out.println("Enter 10 integers : ");
//        getInput();
//        printArray(baseData);
//        resizeArray();
////        System.out.println("enter 12 integers: ");
////        getInput();
//        baseData[10] = 67;
//        baseData[11] = 34; // would be continually having to resize/update the array over time like this
//        printArray(baseData);
//    }
}
