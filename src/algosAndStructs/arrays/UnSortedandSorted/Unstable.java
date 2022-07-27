package algosAndStructs.arrays.UnSortedandSorted;
//if unstable sort, relative ordering of duplicate elements is not guaranteed.
//stable sort is preferable and preserves relative ordering of duplicate elements.

public class Unstable {
//    [5, 9, 3, 9, 8, 4] -> [3, 4, 5, 8, 9, 9]
//    2nd 9 comes 1st in the new (sorted) array.

}

class SelectionSort {
//    init:  lastUnsortedIndex = 6   i = 1 (traverse left to right)   largest = 0 (index of largest unsorted element)
//    if [i] > [largest], then largest = [i]     in-place algorithm     O(n^2) - quadratic
//    after each traversal, selects largest value and adds to end of sorted array.
public static void main(String[] args) {


    int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

    for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
        int largest = 0;

        for (int i = 1; i <= lastUnsortedIndex; i++) {
//            looping through, look for the largest element. start at i=1 since largest is init at 0
            if (intArray[i] > intArray[largest]) {
                largest = i;
//                update largest to the index of the largest element
            }
        }
//        after looping, swap the largest element found with the last unsorted element
        swap(intArray, largest, lastUnsortedIndex);
//        outer loop increases the sorted partition index by 1 from right to left while the inner looks for largest element
    }

}

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
}
}
