package Session09_Array2.p25_ShiftLeft;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        int length=nums.length;
        if(length==0){
            return nums;
        }
        int temp=nums[0];

        for(int i=1;i<length;i++){
            nums[i-1]=nums[i];
        }
        nums[length-1]=temp;
        return nums;
    }
}
