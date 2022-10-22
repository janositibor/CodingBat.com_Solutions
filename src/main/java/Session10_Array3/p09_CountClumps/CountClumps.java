package Session10_Array3.p09_CountClumps;

public class CountClumps {
    public int countClumps(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        boolean clump=false;
        int count=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]){
                if(!clump){
                    count++;
                    clump=true;
                }
            }
            else{
                clump=false;
            }
        }
        return count;
    }
}
