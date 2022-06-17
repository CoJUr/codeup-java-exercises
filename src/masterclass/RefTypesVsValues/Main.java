package masterclass.RefTypesVsValues;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("MyIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); // 11

        int[] myIntArray = new int[5]; //myIntArray holds a reference to an array
        int[] anotherArray = myIntArray; //another reference to the same array

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
        //both are changed. both variables representing the same address(array) this time

        anotherArray = new int[] {4, 5, 6, 7, 8}; //now two different references. anotherArray no longer affected by modifyArray() (de-referenced)
        modifyArray(myIntArray);

        System.out.println("after MODIFY myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after MODIFY anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5}; //dereferencing the array and resetting the values.
        // parameter array now points to a different array, so myIntArray and anotherArray still = [2, 0, 0, 0, 0] like before
    }

}
