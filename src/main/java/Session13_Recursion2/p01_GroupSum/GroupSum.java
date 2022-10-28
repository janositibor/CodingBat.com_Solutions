package Session13_Recursion2.p01_GroupSum;

public class GroupSum {
    public boolean groupSum(int start, int[] nums, int target) {
        if(target==0){
            return true;
        }
        if(nums.length<=start){
            return false;
        }
        int actual=nums[start];
        if(target-actual==0){
            return true;
        }
        return groupSum(start+1,nums,target-actual) || groupSum(start+1,nums,target);
    }
}
