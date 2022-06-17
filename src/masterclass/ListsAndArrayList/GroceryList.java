package masterclass.ListsAndArrayList;

import java.util.ArrayList;

public class GroceryList {


    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){

        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " groceries on your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1 ) + ". " + groceryList.get(i));

        }
    }


    //modify existing items
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1 ) + " has been modified"); //position + 1 b/c 0 indexed
    }


    //remove items
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem); //verifies it exists only

        int position = groceryList.indexOf(searchItem); //searches the list, finds the item & returns its indexed position
        if (position >= 0 ){
            return groceryList.get(position); // if found, return the contents of that entry
        }
        return null; //otherwise return null bc not found
    }
}
