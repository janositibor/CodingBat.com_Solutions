package Session04_Array1.p02_SameFirstLast;

public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        return nums.length>0 && nums[0]==nums[nums.length-1];
    }
}
