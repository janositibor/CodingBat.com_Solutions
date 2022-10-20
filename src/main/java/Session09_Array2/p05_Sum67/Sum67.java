package Session09_Array2.p05_Sum67;

public class Sum67 {
    public int sum67(int[] nums) {
        int sum=0;
        boolean ignore=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==6){
                ignore=true;
                continue;
            }
            if(ignore){
                if(nums[i]==7){
                    ignore=false;
                    continue;
                }
                continue;
            }
            sum+=nums[i];
        }
        return sum;
    }
}
