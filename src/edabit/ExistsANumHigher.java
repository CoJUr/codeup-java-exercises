package edabit;
import java.util.Arrays;

public class ExistsANumHigher {

    //write a function that returns true if there exists at least one number that
    //is larger than or equal to 'n'
    //return false for an empty array[]

    //tests:
//    existsHigher([5, 3, 15, 22, 4], 10); //return true

    public static boolean existsHigher(int[] arr, int n) {
//        for (int i = 0; i < arr.length; i++) {
//            if (n <= arr[i]) {
//                System.out.println("found a bigger num: " + i)
//                    return true;
//                    break;
//            }
//        }
//        return false;

//        1
//        if (arr.length == 0) return false;
//
//        for (int i : arr) if (i >= n) return true;
//        return false;
//    }


            return Arrays.stream(arr).anyMatch(value -> value >= n);

    }

    public static void main(String[] args) {
//        existsHigher([5, 3, 15, 22, 4], 10);
    }
}