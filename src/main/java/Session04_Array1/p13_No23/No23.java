package Session04_Array1.p13_No23;

public class No23 {
    public boolean no23(int[] nums) {
        for(int element:nums){
            if(element==2 || element==3){
                return false;
            }
        }
        return true;
    }
}
