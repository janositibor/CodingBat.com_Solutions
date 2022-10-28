package Session13_Recursion2.p08_Split53;

public class Split53 {
    public boolean split53(int[] nums) {
        return split53Helper(0, nums, 0, 0);
    }

    private boolean split53Helper(int start, int[] nums, int group5, int group3) {
        if(nums.length<=start){
            return group5==group3;
        }
        int actual=nums[start];
        if(actual%5==0){
            return split53Helper(start+1,nums,group5+actual,group3);
        }
        if(actual%3==0){
            return split53Helper(start+1,nums,group5,group3+actual);
        }
        return split53Helper(start+1,nums,group5+actual,group3) || split53Helper(start+1,nums,group5,group3+actual);
    }
}
