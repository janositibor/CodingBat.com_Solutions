package Session09_Array2.p04_Sum13;

public class Sum13 {
    public int sum13(int[] nums) {
        int sum=0;
        boolean ignore=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==13){
                ignore=true;
                continue;
            }
            if(ignore){
                ignore=false;
                continue;
            }
            sum+=nums[i];
        }
        return sum;
    }
}
