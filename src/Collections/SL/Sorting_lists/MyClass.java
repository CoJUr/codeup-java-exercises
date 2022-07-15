package Collections.SL.Sorting_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        //methods in Collections class are static

        ArrayList<String> animals = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();

        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");

        System.out.println(animals);
        Collections.sort(animals);
        System.out.println(animals);

        nums.add(3);
        nums.add(36);
        nums.add(73);
        nums.add(40);
        nums.add(1);

        Collections.sort(nums);
        System.out.println(nums);

        System.out.println(Collections.max(nums)); //73
        System.out.println(Collections.max(animals)); //tiger....LAST El of the (now sorted) ArrayList

        System.out.println(Collections.min(nums));
        System.out.println("Min animal: " +Collections.min(animals)); //1st El

        Collections.reverse(animals);
        System.out.println(animals); //starts with tiger again

        Collections.shuffle(nums);
        Collections.shuffle(animals);

        System.out.println(animals);
        System.out.println(nums);


        ArrayList<Integer> numz = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(numz.size() < 5) {
            //take number inputs until list size =/= 5.   then, output max and min vals
            int num = scanner.nextInt();
            numz.add(num);
        }
        System.out.println(Collections.max(numz));
        System.out.println(Collections.min(numz));
    }
}
