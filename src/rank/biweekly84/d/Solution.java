package rank.biweekly84.d;

public class Solution {

    public long minimumReplacement(int[] nums) {
        int min = Integer.MAX_VALUE;
        long ret = 0;
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] > min) {
                int a = (nums[j] + min - 1) / min;
                ret += a - 1;
                min = nums[j] / a;
            } else {
                min = nums[j];
            }
        }
        return ret;
    }

}
