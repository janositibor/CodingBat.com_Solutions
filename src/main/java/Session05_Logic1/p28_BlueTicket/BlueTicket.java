package Session05_Logic1.p28_BlueTicket;

public class BlueTicket {
    public int blueTicket(int a, int b, int c) {
        if(a+b==10 || b+c==10 || a+c==10){
            return 10;
        }
        if(a+b==b+c+10 || a+b==a+c+10){
            return 5;
        }
        return 0;
    }
}
