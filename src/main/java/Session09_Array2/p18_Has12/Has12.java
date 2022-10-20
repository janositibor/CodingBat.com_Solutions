package Session09_Array2.p18_Has12;

public class Has12 {
    public boolean has12(int[] nums) {
        return (firstAppearance(nums,1)>-1 && lastAppearance(nums,2)>-1 && lastAppearance(nums,2) > firstAppearance(nums,1));
    }

    private int firstAppearance(int[] nums, int element){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==element){
                return i;
            }
        }
        return -1;
    }
    private int lastAppearance(int[] nums, int element){
        for (int i = nums.length-1; 0<=i; i--) {
            if(nums[i]==element){
                return i;
            }
        }
        return -1;
    }
}
