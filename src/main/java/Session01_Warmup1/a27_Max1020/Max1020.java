package Session01_Warmup1.a27_Max1020;

public class Max1020 {
    public int max1020(int a, int b) {
        int limitMin=10;
        int limitMax=20;

        if (a<b) {
            int temp=a;
            a=b;
            b=temp;
        }
        if(inRange(a,limitMin,limitMax)){
            return a;
        }
        if(inRange(b,limitMin,limitMax)){
            return b;
        }
        return 0;
    }
    public boolean inRange(int numberToCheck, int min, int max) {
        return min<=numberToCheck && numberToCheck<=max;
    }
}
