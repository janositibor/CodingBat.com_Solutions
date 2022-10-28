package Session13_Recursion2.p03_GroupNoAdj;

public class GroupNoAdj {
    public boolean groupNoAdj(int start, int[] nums, int target) {
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
        return groupNoAdj(start+2,nums,target-actual) || groupNoAdj(start+1,nums,target);
    }
}
