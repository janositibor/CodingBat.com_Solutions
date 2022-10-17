package Session06_Logic2.p06_CloseFar;

public class CloseFar {
    public boolean closeFar(int a, int b, int c) {
        return (!close(b,c) && ((close(a,b) && !close(a,c)) || (!close(a,b) && close(a,c))));
    }
    private boolean close(int a, int b){
        return Math.abs(a-b)<=1;
    }
}
