package edabit;

public class ExistsANumberHigher {

    public static boolean existsHigher(int[] arr, int n) {
//
//       int count = 0;
//       for (int j : arr) {
//           if (j >= n) {
//               count++;
//           }
//       }
//       return count >= 1;
//    }


        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                result = true;
                break;
            }
        }
        return result;

    }
}
