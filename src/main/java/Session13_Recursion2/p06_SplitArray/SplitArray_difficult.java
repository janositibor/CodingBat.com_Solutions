package Session13_Recursion2.p06_SplitArray;

public class SplitArray_difficult {
    public boolean splitArray(int[] nums) {
        int sum=sum(nums,0);
        return sum%2==0 && groupSum(0, nums, sum/2);
    }
    private boolean groupSum(int start, int[] nums, int target) {
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

    private int sum(int[] nums, int index){
        int length=nums.length;
        if(length==0){
            return 0;
        }
        if(index==length-1){
            return nums[index];
        }
        return nums[index]+sum(nums, index+1);
    }
}
