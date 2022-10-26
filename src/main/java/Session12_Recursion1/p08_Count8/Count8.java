package Session12_Recursion1.p08_Count8;

public class Count8 {
    public int count8(int n) {
        int count=0;
        int digit=n%10;
        int twoDigits=n%100;
        if(digit==8){
            count=1;
        }
        if(twoDigits==88){
            count=2;
        }
        if(n<10){
            return count;
        }
        return count+count8((n-digit)/10);
    }
}
