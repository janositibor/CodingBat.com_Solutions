package Session04_Array1.p16_Fix23;

public class Fix23 {
    public int[] fix23(int[] nums) {
        int length=nums.length;

        for(int i=0;i<length-1;i++){
            if(nums[i]==2 && nums[i+1]==3){
                nums[i+1]=0;
                return nums;
            }
        }
        return nums;
    }
}
