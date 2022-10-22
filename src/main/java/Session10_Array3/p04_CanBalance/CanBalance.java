package Session10_Array3.p04_CanBalance;

public class CanBalance {
    public boolean canBalance(int[] nums) {
        int total=sumOfArray(nums);
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum==1.0*total/2){
                return true;
            }
        }
        return false;

    }
    private int sumOfArray(int[] nums){
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return sum;
    }
}
