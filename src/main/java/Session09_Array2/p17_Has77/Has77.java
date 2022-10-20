package Session09_Array2.p17_Has77;

public class Has77 {
    public boolean has77(int[] nums) {
        int[] tempArray=new int[3];
        for(int i=0;i<nums.length-2;i++){
            tempArray[0]=nums[i];
            tempArray[1]=nums[i+1];
            tempArray[2]=nums[i+2];
            if(countElement(tempArray,7)>=2){
                return true;
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
