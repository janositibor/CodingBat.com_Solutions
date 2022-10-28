package Session13_Recursion2.p07_SplitOdd10;

public class SplitOdd10_difficult {
    public boolean splitOdd10(int[] nums) {
        int sum=sum(nums,0);
        if(sum%2==0) {
            return false;
        }
        return groupSumIsMultipleOfTen(nums,0, sum);

    }
    private boolean groupSumIsMultipleOfTen(int[] nums,int target, int totalSum){

        if(target>totalSum){
            return false;
        }
        return groupSum(0, nums, target) || groupSum(0, nums, target+10);
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
