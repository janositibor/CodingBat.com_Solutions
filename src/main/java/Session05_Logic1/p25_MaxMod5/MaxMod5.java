package Session05_Logic1.p25_MaxMod5;

public class MaxMod5 {
    public int maxMod5(int a, int b) {
        if(a==b){
            return 0;
        }
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return (a%5==b%5)?a:b;
    }
}
