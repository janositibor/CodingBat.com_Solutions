package Session01_Warmup1.a08_PosNeg;

public class Main {
    public static void main(String[] args) {
        PosNeg posNeg=new PosNeg();
        System.out.println(posNeg.posNeg(1, -1, false));
        System.out.println(posNeg.posNeg(-1, 1, false));
        System.out.println(posNeg.posNeg(4, -5, true));
        System.out.println(posNeg.posNeg(-4, -5, true));
    }
}
