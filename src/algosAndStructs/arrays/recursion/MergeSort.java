package algosAndStructs.arrays.recursion;

/*  Merge Sort is a divide and conquer algorithm. splits into a left and right array,
then recursively splits those arrays into left and right arrays continuing until each array has 1 element.
note: 1 element arrays are sorted by definition

then enter the merging phase.merge each left & right pair of arrays into a sorted array.
then merge the sorted arrays into a larger sorted array. continue until all arrays are merged into a single sorted array, sorting when merging.
merging phase does NOT happen in-place (unlike the splitting phase). uses a temp array to hold the sorted values. then copies the temp array back into the original array.
*/
// usually implemented using recursion but can be done with loops
/*
2 major phases: splitting and merging
do sorting during merging phase
splitting prepares the data for faster merging phase
splitting is logical - not creating new actual arrays. use indices to keep track of where the splits are
* */
public class MergeSort {

    /*starting with usual array 20, 35, -15, 7, 55, 1, -22
    start = 0 end = 7 (array.length)    midpoint = (start + end) / 2  =  3     elements 0 - 2 are in left array, 3 - 6 are in right array

     */

    /*
    * 1st split: looking at left array. start = 0  end = 3  (end indx always 1+lastIndx)   midpoint = 1
    * 2nd split: looking at left array. start = 0  end = 1  midpoint = 0
    * 3rd split: looking at right array of left. start = 1  end = 3  midpoint = (1+3)/2 = 2
    * initial left array now only needs its right array (positions 1 and 2) split. Elements 1-1 will go left, 2-2 will go right
    *  */
}
