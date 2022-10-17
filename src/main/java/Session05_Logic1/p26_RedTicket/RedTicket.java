package Session05_Logic1.p26_RedTicket;

public class RedTicket {
    public int redTicket(int a, int b, int c) {
        if(a+b+c==6){
            return 10;
        }
        if(a==b && b==c){
            return 5;
        }
        if(a!=b && a!=c){
            return 1;
        }
        return 0;
    }
}
