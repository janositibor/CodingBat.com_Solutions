package Session06_Logic2.p07_Blackjack;

public class Blackjack {
    public int blackjack(int a, int b) {
        if(a<=21 && b<=21){
            return (a>=b?a:b);
        }
        if(a<=21 || b<=21){
            return (a<=b?a:b);
        }
        return 0;
    }
}
