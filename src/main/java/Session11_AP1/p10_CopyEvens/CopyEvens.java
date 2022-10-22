package Session11_AP1.p10_CopyEvens;

public class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int index=0;
        int[] output=new int[count];
        int i=0;
        while(index<count){
            if(nums[i]%2==0){
                output[index]=nums[i];
                index++;
            }
            i++;
        }
        return output;
    }
}
