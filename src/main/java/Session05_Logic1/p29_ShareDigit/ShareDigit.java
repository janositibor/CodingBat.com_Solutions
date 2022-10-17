package Session05_Logic1.p29_ShareDigit;

public class ShareDigit {
    public boolean shareDigit(int a, int b) {
        return(a/10==b/10 || a/10==b%10 || a%10==b/10 || a%10==b%10);
    }
}
