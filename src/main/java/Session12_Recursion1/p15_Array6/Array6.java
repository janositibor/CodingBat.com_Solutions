package Session12_Recursion1.p15_Array6;

public class Array6 {
    public boolean array6(int[] nums, int index) {
        int length=nums.length;
        if(index==length){
            return false;
        }
        if(nums[index]==6){
            return true;
        }
        return array6(nums, index+1);
    }
}
