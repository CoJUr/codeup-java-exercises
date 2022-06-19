package masterclass.arrays;

import java.util.Scanner;

public class MinElCh {

    private static Scanner scanner = new Scanner(System.in);




    public static void main(String[] args) {

        //determine how many elements are to be entered before calling readIntegers
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine(); //ghost handling

        //call the readIntegers method and save the value
        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);


    }

    //write method with param called 'count' to represent how many ints the user needs to enter and how many #s to read from the console
    private static int[] readIntegers(int count) {
        //create an int array and populate it with user input
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine(); //handle the ghost

            //populate the array with the # entered
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        //cycle through the array to find the smallest value
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            //compare the above value with the current value of min with each iteration
            if (value < min) {
                min = value;
            }
        }
        return min;

    }
}
