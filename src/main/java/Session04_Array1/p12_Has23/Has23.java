package Session04_Array1.p12_Has23;

public class Has23 {
    public boolean has23(int[] nums) {
        for(int element:nums){
            if(element==2 || element==3){
                return true;
            }
        }
        return false;
    }
}
