package Collections.SL;

import java.util.HashMap;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

//        playing with put, remove, get
        HashMap<String, Integer> points = new HashMap<>();
        points.put("Amy", 154);
        points.put("Dave", 44);
        points.put("Rob", 733);

        System.out.println(points.get("Dave"));
        System.out.println(points.get(points)); //prints null

        System.out.println(points.remove("Rob"));
        System.out.println(points.containsValue(733));
        System.out.println(points.containsKey("Rob"));
        System.out.println(points.containsKey("Dave"));

//        points.put("Ami", 12);
//        System.out.println(points);


        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);

        String[] nameArr = new String[ages.size()];
        System.out.println(nameArr.length);

        nameArr = ages.keySet().toArray(nameArr);

        System.out.println("Enter age limit: ");
        int ageLimit = scanner.nextInt();

        for (String emp : nameArr) {
            if (ages.get(emp) < ageLimit){
                ages.remove(emp);
                System.out.println("Removed: " + emp);
            }
        }

    }
}
