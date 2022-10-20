package Session09_Array2.p15_Either24;

public class Either24 {
    public boolean either24(int[] nums) {
        return hasSameNeighbours(nums,2)^hasSameNeighbours(nums,4);
    }
    private boolean hasSameNeighbours(int[] nums,int element) {
        for (int i=0;i<nums.length;i++){
            if(nums[i]==element){
                if(i>0 && nums[i-1]==element){
                    return true;
                }
                if(i<nums.length-1 && nums[i+1]==element){
                    return true;
                }
            }
        }
        return false;
    }
}
