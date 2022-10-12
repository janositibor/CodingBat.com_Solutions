package Session02_Warmup2.a15_Array667;

public class Array667 {
    public int array667(int[] nums) {
        int numberOfOccurrence=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==6 && i+1<nums.length){
                if(nums[i+1]==6 || nums[i+1]==7){
                    numberOfOccurrence++;
                }
            }
        }
        return numberOfOccurrence;
    }
}
