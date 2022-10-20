package Session09_Array2.p19_ModThree;

public class ModThree {
    public boolean modThree(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int actual=nums[0]%2;
        int counter=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2==actual){
                counter++;
                if(counter==3){
                    return true;
                }
            }
            else{
                actual=nums[i]%2;
                counter=1;
            }
        }
        return false;
    }
}
