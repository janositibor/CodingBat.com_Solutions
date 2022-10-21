package Session09_Array2.p26_TenRun;

public class TenRun {
    public int[] tenRun(int[] nums) {
        int length=nums.length;
        int[] output=new int[length];
        int temp=-1;
        int actual;
        for(int i=0;i<length;i++){
            actual=nums[i];
            if(actual%10==0){
                output[i]=actual;
                temp=actual;
            }
            else{
                if(temp==-1){
                    output[i]=actual;
                }
                else{
                    output[i]=temp;
                }
            }
        }
        return output;
    }
}
