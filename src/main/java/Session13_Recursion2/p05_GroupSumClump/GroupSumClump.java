package Session13_Recursion2.p05_GroupSumClump;

public class GroupSumClump {
    public boolean groupSumClump(int start, int[] nums, int target) {
        int length=nums.length;
        int count=1;
        if(target==0){
            return true;
        }
        if(length<=start){
            return false;
        }
        int actual=nums[start];
        while(start+count<length && actual==nums[start+count]){
            count++;
        }

        return groupSumClump(start+count,nums,target-count*actual) || groupSumClump(start+count,nums,target);
    }
}
