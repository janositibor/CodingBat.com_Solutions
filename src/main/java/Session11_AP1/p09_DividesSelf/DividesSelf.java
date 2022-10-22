package Session11_AP1.p09_DividesSelf;

public class DividesSelf {
    public boolean dividesSelf(int n) {
        int digit;
        int temp=n;
        do{
            digit=temp%10;
            if(digit==0 || n%digit!=0){
                return false;
            }
            temp=(temp-digit)/10;
        }
        while(temp>0);
        return true;
    }
}
