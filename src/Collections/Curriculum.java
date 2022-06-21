package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Curriculum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);    // adding an element
        numbers.add(0, 21); // specifying an index
        numbers.add(22);
        System.out.println(numbers.indexOf(22));



        //hasmap
        HashMap<String, String> usernames = new HashMap<>();

        //put data into usernames
        usernames.put("ryan", "ryanorsinger");
        usernames.put("zach", "zgulde");
        usernames.put("fernando", "fmendozaro");

        System.out.println(usernames);

        //obtain values from the hashmap via key
        System.out.println(usernames.get("ryan"));
        System.out.println(usernames.get("Philip"));
        System.out.println(usernames.getOrDefault("Jason", "gocodeup"));
        System.out.println(usernames.get("Jason")); // null?

        //verify keys or values exist
        System.out.println(usernames.containsKey("zach"));
        System.out.println(usernames.containsValue("zgulde"));

    }
}
