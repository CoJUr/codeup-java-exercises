package algosAndStructs.arrays.UnSortedandSorted;
//growing sorted part from left to right this time - from the front of the array.
//says 1st el in the array is in the sorted part. thus sorted partition length = 1 and unsorted is everything to the right of 0th index
// 1st unsorted index = i=1.   i = used to track right-most index of sorted partition   looking for a val <= one we're trying to insert
//O(n^2) - quadratic     stable     in-place     potential for a LOT of shifting
public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
//            growing sorted partition from left -> right, so incrementing instead of decrementing
//            first: save value of el to be inserted into a temp variable bc that position will be overwritten
            int newElement = intArray[firstUnsortedIndex];

            int i;
//            now for the loop that does the traversal of the sorted partition (right to left), looking for the position to insert the new element
            for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--) {
//                keep looking through the sorted partition as long as haven't found a <= value to the newElement or hit index 0
//                shift the el at i-1 to the right by 1 position
                intArray[i] = intArray[i-1];
            }
//            final step when dropping out of loop assign the newElement to the index we found in the sorted partition
            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }
    }
}
