package masterclass.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrCh {
    private static Scanner scanner = new Scanner(System.in);






    public static void main(String[] args) {
        int[] challenge = getIntegers(5);

        printArray(challenge);



    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("enter " + capacity + " integer values");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortIntegers(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {

            flag = false;
            //if the forloop isnt finished, assign flag back to true.
            //if dont reset flag, while loop ends

            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] < newArray[i+1]) { //next index bigger than previous? then lets swap them

                    temp = newArray[i]; // store current(smaller) value into a temporary

                    newArray[i] = newArray[i+1]; // move the bigger value into the current
                    newArray[i+1] = temp; // move the saved smaller value from temp into next

                    //all this to swap position 1 with position 0 if its bigger than 0

                    flag = true; //repeat until the highest number is at position 0
                }
            }
        }
        return newArray;
    }
}



