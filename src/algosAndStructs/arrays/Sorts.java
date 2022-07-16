package algosAndStructs.arrays;

public class Sorts {

    public static void main(String[] args) {
        //bubble sort: performance scales poorly. O(n^2)   i = 0 -index used to traverse left -> right. comparing [i] with its right neighbor
        //sorting in ascending order. e.g: swapping arr[0] and arr[1] IF [0] > [1], then i++ and compare [1] to [2] etc until i = last unsortedPartionIndex
    // after 1 pass-through, new unsortedPartitionIndex = 2nd to last [i], set i back to 0 to restart process, rinse repeat.
    // in-place algorithm: extra memory needed doesnt depend on # items sorting, or increasing # of items doesn't increase memory usage

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            //sorted partition grows from right TO left since bubbling largest to the right. lastUnsortedIndex goes from 6 to 0
            for (int i = 0; i < lastUnsortedIndex; i++) {
//                if [i] > [i+1], then swap
                if (intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                }
            }
        }

//        print out the array once sorted to verify
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
//            then the indexes would be the same, so do nothing
            return;
        }

        //if indexes not same, set up swap. save value from i, then overwrite [i] with [j]. finally put temp in j
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
