package Session11_AP1.p15_ScoresSpecial;

public class ScoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        return specialInArray(a)+specialInArray(b);
    }
    private int specialInArray(int[] nums){
        int output=0;
        int actual;
        for (int i = 0; i < nums.length; i++) {
            actual=nums[i];
            if(actual%10==0 && actual>output){
                output=actual;
            }
        }
        return output;
    }
}
