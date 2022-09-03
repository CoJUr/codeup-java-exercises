package algosAndStructs.arrays.recursion;

public class MainMerge {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    //2 methods: mergeSort (the impl which calls itself recursively) and merge (does the merging)


    public static void mergeSort(int[] input, int start, int end) {
        //first need breaking condition. when to break recursion. when this method is called with a 1 El array bc it is sorted by definition
        if (end - start < 2) {
            return;
        }

        //if not a 1 El array, then split passed array into 2 arrays
        //figure out where start and end point are because its a logical partitioning
        int mid = (start + end) / 2;
        //first invocation: start = 0, end = 7, mid = 3   remember end = 1 greater than the last valid indx   0 + 7 / 2 = 3

        //now can do a merge sort on the left partition     end indx for left array is mid
        mergeSort(input, start, mid);
        //now the first 3 Els are partitioned and sorted.
        mergeSort(input, mid, end);
        //now the last 4 Els are also partitioned and sorted. final step is to merge the original 2 partitions into a single sorted array
        merge(input, start, mid, end);
    }


    //    20, 35, -15, 7, 55, 1, -22
    public static void merge(int[] input, int start, int mid, int end) {

        //optimization 1: if last El of left array (mid - 1) is <= first El of right array (mid),
        // then the 2 arrays are already sorted so don't need to do any more processing to merge them
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        //if here, some Els of the left array are > some Els of the right array so need to merge them

        int i = start;
        int j = mid;
        int tempIndex = 0; //tracks where we are in the temp array when we copy the sorted values back into the original array

        int[] temp = new int[end - start]; // need it large enough to hold all the Els of the 2 partitions. yields 7 int array

        //step through the arrays comparing whatever is at indx i of left array to whatever is at indx j of right array
        //, put the smaller of them into the current position in temp array(tempIndex),
        // then increment the indx of the array that had the smaller El
        while (i < mid && j < end) { // drop out of loop if finished traversing either array
            temp[tempIndex++] =
                    input[i] <= input[j] ? input[i++] : input[j++];
            //writing the smaller of the 2 Els from each arrays current index into the temp array.  *(using the = to make sure the sort is stable)*
            //then increment tempIndex and the indx of the array that had the smaller El
        }

        //now have to handle the remaining Els in the left or right array that we haven't traversed.
        //optimization 2: if the remaining Els are in the right array,
        // don't have to do anything bc the other Els are smaller and already in the temp array so its position in input array won't change after merge

        //the remaining Els in the left array won't be copied into the temp array -- jump over all the Els copied instead. can do this in the input array
        System.arraycopy(input, i, input, start + tempIndex, mid - i); //copies els from one location in the input array to another location in the input array
        //i = the 1st indx we haven't yet handled
        // mid - i = the # of Els we didn't copy over into the temp array from the left partition.
        // if completely traversed the left partition, this will be 0 so won't do anything. same for if DID completely traverse the right partition

        //final step: copy over the temp array
        System.arraycopy(temp, 0, input, start, tempIndex); //only copies the # of Els we copied over into the temp array, not the whole temp array
    }




}
