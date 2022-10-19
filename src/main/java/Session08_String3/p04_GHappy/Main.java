package Session08_String3.p04_GHappy;

public class Main {
    public static void main(String[] args) {
        GHappy gHappy=new GHappy();

        System.out.println(gHappy.gHappy("xxggxx"));
        System.out.println(gHappy.gHappy("xxgxx"));
        System.out.println(gHappy.gHappy("xxggyygxx"));
        System.out.println(gHappy.gHappy("xxggyyxxgg"));
        System.out.println(gHappy.gHappy("ggggggxxggyyxxgg"));
    }
}
