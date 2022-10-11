package Session01_Warmup1.a26_In3050;

public class In3050 {
    public boolean in3050(int a, int b) {
        return bothInRange(a,b,30,40) || bothInRange(a,b,40,50);
    }
    public boolean bothInRange(int numberToCheck1,int numberToCheck2, int min, int max) {
        return inRange(numberToCheck1,min,max) && inRange(numberToCheck2,min,max);
    }
    public boolean inRange(int numberToCheck, int min, int max) {
        return min<=numberToCheck && numberToCheck<=max;
    }
}
