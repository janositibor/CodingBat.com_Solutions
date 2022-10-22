package Session11_AP1.p08_HasOne;

public class HasOne {
    public boolean hasOne(int n) {
        int digit;
        do{
            digit=n%10;
            if(digit==1){
                return true;
            }
            n=(n-digit)/10;
        }
        while(n>0);
        return false;
    }
}
