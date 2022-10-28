package Session13_Recursion2.p06_SplitArray;

public class SplitArray {
    public boolean splitArray(int[] nums) {
        return splitArrayHelper(0, nums, 0, 0);
    }

    private boolean splitArrayHelper(int start, int[] nums, int group1, int group2) {
        if(start >= nums.length) {
            return group1 == group2;
        }
        return splitArrayHelper(start+1, nums, group1 + nums[start], group2) || splitArrayHelper(start+1, nums, group1, group2 + nums[start]);
    }
}
