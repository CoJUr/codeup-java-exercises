package leetcode.Day1;

import java.util.Arrays;
//time complexity: O(n) where n = length of input array
public class RunningSum {

    public static int[] runningSum(int[] nums){
        int ans[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if ( i == 0 ) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i] + ans[i-1];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
    }
}

class Solution {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

//        init 1st el of result arr with 1st el of nums
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
//            result at i is sum of result at -1 and nums[i]
            result[i] =  result[ i - 1 ] + nums[i] ;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3})));
    }


}
