package Session13_Recursion2.p07_SplitOdd10;

public class SplitOdd10 {
    public boolean splitOdd10(int[] nums) {
        return splitOdd10Helper(0, nums, 0, 0);
    }

    private boolean splitOdd10Helper(int start, int[] nums, int mult, int odd) {
        if(start >= nums.length) {
            return mult % 10 == 0 && odd % 2 == 1;
        }
        return splitOdd10Helper(start+1, nums, mult + nums[start], odd) || splitOdd10Helper(start+1, nums, mult, odd + nums[start]);
    }
}
