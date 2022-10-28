package Session13_Recursion2.p04_GroupSum5;

public class GroupSum5 {
    public boolean groupSum5(int start, int[] nums, int target) {
        if(nums.length<=start){
            return target==0;
        }
        int actual=nums[start];
        if(actual%5==0){
            if(nums.length>start+1 && nums[start+1]==1) {
                return groupSum5(start + 2, nums, target - actual);
            }
            return groupSum5(start+1,nums,target-actual);
        }
        return groupSum5(start+1,nums,target-actual) || groupSum5(start+1,nums,target);
    }
}
