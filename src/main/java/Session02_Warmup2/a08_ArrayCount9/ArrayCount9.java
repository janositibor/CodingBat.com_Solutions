package Session02_Warmup2.a08_ArrayCount9;

public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int numToFind=9;
        int found=0;
        for(int number:nums){
            if(number==numToFind){
                found++;
            }
        }
        return found;
    }
}
