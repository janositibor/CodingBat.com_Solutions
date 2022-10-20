package Session09_Array2.p02_BigDiff;

public class BigDiff {
    public int bigDiff(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max-min;
    }
}
