package algosAndStructs.arrays.UnSortedandSorted;

/*Shell Sort variation of insertion sort cuts down on the number of shifting operations of insertion sort
by comparing elements that are farther apart than 1, rather than a gap of just 1.
as the algo runs, the gap is reduced until it is 1, at which point it becomes insertion sort for the final iteration.

What do we use for the gap value? What do we start with and how do we reduce it?
want the gap to be close as possible to the length of the array, but not greater than it

knuth sequence is a common choice for gap values. 3x+1 sequence is another common choice.

Knuth sequence: calculates gap using (3^k - 1) / 2   k is based on the length of the array
k    gap
1    1
2    4
3    13
4    40
eg: array with 20 elements, start with k=3 so gap = 13. then k=2 so gap = 4. then k=1 so gap = 1.

however we'll just initialize gap at array.length/2 and then divide by 2 each iteration until gap = 1
starting with array length of 7, gap = 3.  then dividing 3 by 2 = 1 so gap = 1.  2 iterations total.

time complexity: varies depending on gap sequence used. worst case is O(n^2) - quadratic

space complexity: O(1) - constant



20, 35, -15, 7, 55, 1, -22
i = gap = 3
j = i = 3
newElement = intArray[i] = 7   (save the value we're working with into newElement)
compare intArray[j - gap] to newElement    j - gap = 3-3 = 0
compare 20 to 7 since gap is 3 and 7 is 3 positions away from 20
7 < 20, so assign 20 to where 7 was   then set j to j-gap which is 0
now have hit the front of the array so assign newElement to intArray[j] e.i. intArray[0] = 7

now want to set i = 4  and  j = i = 4   newElement = intArray[i] = 55
compare intArray[j - gap] to newElement i.e. compare 55 to 35    35 < 55 so do nothing

now i = 5 and j = 5   newElement = intArray[i] = 1   compare 1 to -15  1 > -15 so do nothing

now i = 6    j = i = 6   newElement = intArray[i] = -22 compare -22 [indx = 6] to 20 [indx = 3]
-22 < 20 so assign 20 to position 6 and now j = j - gap = 6 - 3 = 3  and compare newElement(-22) to El @ position 0 which is 7.
-22 < 7 so so assign 7 to position 3. now have hit the front of the array.

[7, 35, -15, 7, 55, 1, 20]
j = j - gap = 3 - 3 = 0
no more elements to compare -22 against so assign it to position 0  [-22, 35, -15, 7, 55, 1, 20]. ITERATION COMPLETE

now update the gap to 3 / 2 = 1, switching to insertion sort on the somewhat sorted array (less shifting operations)

Shell Sort facts: in-place algorithm    unstable algorithm     undefined time complexity; worst case is O(n^2) - quadratic
can improve bubble sort or insertion sort algos by using shell sort
 */
public class ShellSort {



    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        //first loop will initialize and then reduce the gap value each iteration
        for (int gap = intArray.length / 2; gap > 0; gap/=2) {

            //now code the actual comparing and shifting of elements - essentially insertion sort
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i]; //intArray[i] is essentially intArray[gap]

                int j = i; // j does the traversing. need different index because don't want to be changing i as we traverse and search for the insertion point

                //if j becomes less than gap, then we've hit the front of the array, so do j >= gap
                while (j >= gap && intArray[j - gap] > newElement) {
                    //then move the element at j - gap up the array by # of positions equal to gap
                    intArray[j] = intArray[j - gap];
                    // initially putting the element at position 3 to position 0 because 7 < 20.

                    j -= gap;
                    //decrement j (the next element we look at) by gap, so as to look at the next element that is gap positions away
                }

                //assign newElement to the position where j is at
                intArray[j] = newElement;
                //then when we loop back to the outer for loop, we'll increment i by 1 to i=4 (looking at 55),
                // j would become 4 and repeat the process - comparing 55 to 35. it won't be able to jump another gap of 3 so break out of the while loop again

            }

        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }




        //review of insertion sort impl. basically the same thing as Shell Sort, but here initialize (gap) to 1
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
             firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex]; //assign newElement to the initiated (/unsorted) element

            int i;
            //only other difference really is the loop is taking care of assigning i, just decrementing it each time
            for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--) {
                //looping through all the elements, shifting them to the right if possible
                intArray[i] = intArray[i - 1];
            }

            //dropping out of the for loop means we've found the insertion point; can assign newElement to the position where [i] left off
                intArray[i] = newElement;

        }
    }
}
