package Session04_Array1.p06_RotateLeft3;

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        if(nums.length<2){
            return nums;
        }

        int temp=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=temp;
        return nums;
    }
}
