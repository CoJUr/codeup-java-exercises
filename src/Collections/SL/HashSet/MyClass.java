package Collections.SL.HashSet;

import java.util.HashSet;

public class MyClass {
    //Sets can't contain dupe Els.   model of mathematical set abstraction.  an implementation is HashSet.   Don't retain order

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set); //[a, b, c
        System.out.println(set.size());

        //order HashSets via LinkedHashSet (maintains a linked-list of the Els in the order inserted)

        //hashing: the way tables store info. key's content use to determine a unique value called a hash code.
    }
}
