package Session01_Warmup1.a22_MixStart;

public class Main {
    public static void main(String[] args) {
        MixStart mixStart=new MixStart();

        System.out.println(mixStart.mixStart(null));
        System.out.println(mixStart.mixStart(""));
        System.out.println(mixStart.mixStart("m"));
        System.out.println(mixStart.mixStart("mix snacks"));
        System.out.println(mixStart.mixStart("pix snacks"));
        System.out.println(mixStart.mixStart("piz snacks"));
    }
}
