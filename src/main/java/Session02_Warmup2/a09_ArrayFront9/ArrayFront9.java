package Session02_Warmup2.a09_ArrayFront9;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int numToFind=9;
        int firstNElement=4;
        int i=0;
        while(i<firstNElement && i<nums.length){
            if(nums[i]==numToFind){
                return true;
            }
            i++;
        }
        return false;
    }
}
