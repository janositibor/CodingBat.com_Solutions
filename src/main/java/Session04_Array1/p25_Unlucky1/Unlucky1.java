package Session04_Array1.p25_Unlucky1;

public class Unlucky1 {
    public boolean unlucky1(int[] nums) {
        int length=nums.length;
        if(length<2){
            return false;
        }

        int[] positionsToCheck=new int[]{0,1,length-2};

        for(int position:positionsToCheck){
            if(nums[position]==1 && nums[position+1]==3){
                return true;
            }
        }
        return false;
    }
}
