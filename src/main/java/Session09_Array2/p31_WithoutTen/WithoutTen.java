package Session09_Array2.p31_WithoutTen;

public class WithoutTen {
    public int[] withoutTen(int[] nums) {
        int length=nums.length;
        int indexToRead=0;
        int indexToWrite=0;
        int actual;
        while(indexToWrite<length){
            if(indexToRead<length){
                actual=nums[indexToRead];
            }
            else{
                actual=0;
            }
            if(actual!=10){
                nums[indexToWrite]=actual;
                indexToWrite++;
            }
            indexToRead++;
        }
        return nums;
    }
}
