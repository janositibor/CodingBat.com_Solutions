package Session11_AP1.p11_CopyEndy;

public class CopyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int index=0;
        int[] output=new int[count];
        int i=0;
        while(index<count){
            if(isEndy(nums[i])){
                output[index]=nums[i];
                index++;
            }
            i++;
        }
        return output;
    }
    private boolean isEndy(int num){
        return((0<=num && num<=10) || (90<=num && num<=100));
    }
}
