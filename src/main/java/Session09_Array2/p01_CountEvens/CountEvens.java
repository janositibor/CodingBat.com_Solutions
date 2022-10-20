package Session09_Array2.p01_CountEvens;

public class CountEvens {
    public int countEvens(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
