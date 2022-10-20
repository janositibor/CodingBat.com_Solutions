package Session09_Array2.p13_No14;

public class No14 {
    public boolean no14(int[] nums) {
        return !contains(nums,1) || !contains(nums,4);

    }
    private boolean contains(int[] nums, int element){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                return true;
            }
        }
        return false;
    }
}
