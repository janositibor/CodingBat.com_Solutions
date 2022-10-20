package Session09_Array2.p06_Has22;

public class Has22 {
    public boolean has22(int[] nums) {
        for (int i=0;i<nums.length;i++){
            if(nums[i]==2){
                if(i>0 && nums[i-1]==2){
                    return true;
                }
                if(i<nums.length-1 && nums[i+1]==2){
                    return true;
                }
            }
        }
        return false;
    }
}
