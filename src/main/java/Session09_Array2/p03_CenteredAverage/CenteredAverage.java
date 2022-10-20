package Session09_Array2.p03_CenteredAverage;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int sum=0;
        int min=nums[0];
        int max=nums[0];
        int actual;
        for(int i=0;i<nums.length;i++){
            actual=nums[i];
            sum+=actual;
            if(min>actual){
                min=actual;
            }
            if(max<actual){
                max=actual;
            }
        }
        return (sum-max-min)/(nums.length-2);
    }
}
