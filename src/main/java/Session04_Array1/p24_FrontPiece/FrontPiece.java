package Session04_Array1.p24_FrontPiece;

public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        int length=Math.min(2, nums.length);
        int[] output=new int[length];

        for(int i=0; i<length; i++){
            output[i]=nums[i];
        }
        return output;
    }
}
