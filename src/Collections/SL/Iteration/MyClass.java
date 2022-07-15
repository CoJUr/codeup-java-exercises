package Collections.SL.Iteration;

import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {

    //all collection classes provide an iterator() that returns an iterator to the start of the collection
    // the Iterator class provides:  hasNext() -boolean  |
    // next() -returns the next obj and advances iterator  |
    // remove() - removes the last obj that was returned by next |


    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        Iterator<String> it = animals.iterator();
        String value = it.next(); //fox - 1st El returned, then iterator advances to next El
        System.out.println(value);
        String value2 = it.next();
        System.out.println(value2); // cat
        value2 = it.next();
        System.out.println(value2); // dog

        value = it.next();
        System.out.println(value); // rabbit!
//        value = it.next();
//        System.out.println(value); // EXECEPTION! no such element


        System.out.println("===========");
        Iterator<String> it3 = animals.iterator();

        while(it3.hasNext()) {
            String value3 = it3.next();
            System.out.println(value3);
                //same as :
//            System.out.println(it3.next());
        }

    }
}
