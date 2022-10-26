package Session12_Recursion1.p17_Array220;

public class Array220 {
    public boolean array220(int[] nums, int index) {
        if(index>=nums.length-1){
            return false;
        }
        if(10*nums[index]==nums[index+1]){
            return true;
        }
        return array220(nums, index+1);
    }
}
