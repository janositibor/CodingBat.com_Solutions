package Session12_Recursion1.p16_Array11;

public class Array11 {
    public int array11(int[] nums, int index) {
        int length=nums.length;
        int count=0;
        if(index>length-1){
            return 0;
        }
        if(nums[index]==11){
            count++;
        }
        return count+array11(nums, index+1);
    }
}
