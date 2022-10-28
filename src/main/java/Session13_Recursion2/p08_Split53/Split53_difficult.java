package Session13_Recursion2.p08_Split53;

public class Split53_difficult {
    public boolean split53(int[] nums) {
        int sum=sum(nums,0);
        if(sum%2==1) {
            return false;
        }
        return groupSum53(0, nums,sum/2);
    }
    private boolean groupSum53(int start, int[] nums, int target) {
        if(nums.length<=start){
            return target==0;
        }
        int actual=nums[start];
        if(actual%5==0){
            return groupSum53(start+1,nums,target-actual);
        }
        if(actual%3==0){
            return groupSum53(start+1,nums,target);
        }
        return groupSum53(start+1,nums,target-actual) || groupSum53(start+1,nums,target);
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
