package leetcode;
//return -1 if no leftmost pivot index exists
public class LeftMostPivotIndex {

    public static int pivotIndex(int[] nums) {
        int total = 0;
        int left = 0;
        for (int i: nums) {
            total += i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
//               would be no left El at index 0, so using if statement
                left += nums[i - 1];
            }
            if ((total - left) - nums[i] == left) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}

class solution2{
//    take s as sum   leftsum as sum of #s to the left of current index i    the sum on the right would be s - nums[i] - leftsum
//    leftsum just serves to check if an index is a pivot candidate

//    time complexit: O(N) where n = length of nums   space complexity = O()1 due to space used by leftsum and s(um)
    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;

        for (int i = 0; i < nums.length; i++) {

            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];

        }
        return -1;
    }

    }
