package masterclass.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {



    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit); //accepts a linkedlist param and uses an iterator

        //add Alice Springs to position 1 (right after syndey)
        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit); //Brisbane now points to Canberra instead of Perth - Perth gone
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()){
            //^while the list El is pointing to something else (isnt last), show current record
            System.out.println("Now visiting " + i.next());
            //i.next() changes value of iterator like i++. print the current value but also moves to the next
        }
        System.out.println("==========");
    }

    //creating a method to add cities to visit alphabetically to the list
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        //using a list iterator. increased flexibility
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            //navigate thru all entries in the list iterator and use compareTo

            int comparison = stringListIterator.next().compareTo(newCity);
            //gives a number that, seeing if the items match. if so, dont add anything
            if (comparison == 0) {
                //equal, do not add  if passed adelaide as newCity and its already on file, dont want to add it
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //then the newCity should appear before the current one
                //e.g. iteration passing over Brisbane, newCity is Adelaide, then > 0 so add it
                //but problem: .next() will already be moving onto the next entry. so need to move back one first
                stringListIterator.previous();
                stringListIterator.add(newCity); //add the newCity here so e.g. Adelaide appears before Brisbane
                return true;
            } else if (comparison < 0) {
                //move on to next city -- do nothing.  e.g. Brisbane is newCity and were at Adelaide
                //.next() already incorporated into comparison initialization so dont need to do anything

            }
        }
        //if here, gone through the entire list without finding a point to insert the entry, so put it at the end
        stringListIterator.add(newCity);

    }
}
