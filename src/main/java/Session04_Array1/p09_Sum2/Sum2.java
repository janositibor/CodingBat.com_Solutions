package Session04_Array1.p09_Sum2;

public class Sum2 {
    public int sum2(int[] nums) {
        int sum=0;
        for(int i=0;i<Math.min(2,nums.length);i++){
            sum+=nums[i];
        }
        return sum;
    }
}
