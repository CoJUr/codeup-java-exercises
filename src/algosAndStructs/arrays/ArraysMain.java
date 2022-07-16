package algosAndStructs.arrays;

public class ArraysMain {

    //stored as 1 contiguous block in memory     every El occupies the same amount of space
    // for an arr starting at memory address x, where size of Els is y, memory address of the 'i'th El = x + i * y

    //if index is known, constant time = O(1)          if index not known, linear time = 0(n)
    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] =-22;

        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
            //return value 7 from "?" index. not ideal scenario - # of Els influences # of steps to perform. linear complexity
            if (intArray[i] == 7 ) {
                index = i;
                break;
            }
        }
        System.out.println("Index = " + index);
    }

    //O(1) scenarios: retrieve with index   add an El to the end (providing space)   insert/update EL at known index   Delete an El via assigning null

    //linear O(n): no index retrieval   add El to a full arr    delete an EL by shifting Els
}
