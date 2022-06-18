package masterclass.ListsAndArrayList;

import java.util.ArrayList;

public class GroceryList {


    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){

        groceryList.add(item);
    }


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " groceries on your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1 ) + ". " + groceryList.get(i));

        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        //pass # of the item from findItem and pass it
        int position = findItem(currentItem);
        if (position >= 0) {
            //checking to see if the current item exists. if so, pass it and newItem to sister method
            modifyGroceryItem(position, newItem);
        }
    }

    //modify existing items
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1 ) + " has been modified"); //position + 1 b/c 0 indexed
    }


    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
    //remove items
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {

        return groceryList.indexOf(searchItem);
        //if it exists, will return a number >= 0
    }

    //create a method to enable passing in the name of a grocery and verify it exists
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0; // returns true if item exists
    }
}
