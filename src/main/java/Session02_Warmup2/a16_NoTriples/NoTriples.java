package Session02_Warmup2.a16_NoTriples;

public class NoTriples {
    public boolean noTriples(int[] nums) {
        for(int i=0; i<nums.length;i++){
            if(i+2<nums.length){
                if(nums[i]==nums[i+1] && nums[i]==nums[i+2]){
                    return false;
                }
            }
        }
        return true;
    }
}
