package Session04_Array1.p18_BiggerTwo;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        return sum(b)>sum(a)?b:a;
    }
    private int sum(int[] nums) {
        int sum=0;
        for(int element:nums){
            sum+=element;
        }
        return sum;
    }
}
