package Session09_Array2.p08_Sum28;

public class Sum28 {
    public boolean sum28(int[] nums) {
        int count=0;
        int index=0;
        while(index<nums.length && count<5){
            if(nums[index]==2){
                count++;
            }
            index++;
        }
        return count==4;
    }
}
