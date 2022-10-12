package Session02_Warmup2.a17_Has271;

public class Has271 {
    public boolean has271(int[] nums) {
        for(int i=0; i<nums.length;i++){
            if(i+2<nums.length){
                if(nums[i+1]==nums[i]+5 && Math.abs(nums[i+2]+1-nums[i])<3){
                    return true;
                }
            }
        }
        return false;
    }
}
