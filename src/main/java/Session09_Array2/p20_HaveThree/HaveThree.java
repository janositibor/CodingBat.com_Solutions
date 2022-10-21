package Session09_Array2.p20_HaveThree;

public class HaveThree {
    public boolean haveThree(int[] nums) {
        return countElement(nums,3)==3 && !hasSameTwice(nums,3);
    }

    private boolean hasSameTwice(int[] nums,int element) {
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

    private int countElement(int[] nums, int element){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                count++;
            }
        }
        return count;
    }
}
