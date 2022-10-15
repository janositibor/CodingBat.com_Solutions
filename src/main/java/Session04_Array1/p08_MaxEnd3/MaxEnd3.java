package Session04_Array1.p08_MaxEnd3;

import java.util.Arrays;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int length=nums.length;
        int[] output = new int[length];

        int newValues=Math.max(nums[0],nums[length-1]);
        Arrays.fill(output, newValues);

        return output;
    }
}
