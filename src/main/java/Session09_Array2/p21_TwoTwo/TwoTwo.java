package Session09_Array2.p21_TwoTwo;

public class TwoTwo {
    public boolean twoTwo(int[] nums) {
        return allTimesTwice(nums,2);

    }
    private boolean allTimesTwice(int[] nums,int element) {
        for (int i=0;i<nums.length;i++){
            if(nums[i]==element){
                if(!(i>0 && nums[i-1]==element) && !(i<nums.length-1 && nums[i+1]==element)){
                    return false;
                }
            }
        }
        return true;
    }
}
