package Session09_Array2.p32_ZeroMax;

public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        int largestOdd=0;
        int actual;
        for (int i = nums.length-1; i >=0 ; i--) {
            actual=nums[i];
            if(actual==0){
                nums[i]=largestOdd;
            }
            else if (actual%2==1 && actual>largestOdd){
                largestOdd=actual;
            }
        }
        return nums;
    }
}
