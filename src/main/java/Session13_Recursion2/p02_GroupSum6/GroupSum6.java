package Session13_Recursion2.p02_GroupSum6;

public class GroupSum6 {
    public boolean groupSum6(int start, int[] nums, int target) {
        if(nums.length<=start){
            return target==0;
        }
        int actual=nums[start];
        if(actual==6){
            return groupSum6(start+1,nums,target-actual);
        }
        return groupSum6(start+1,nums,target-actual) || groupSum6(start+1,nums,target);
    }
}
