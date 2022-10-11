package Session01_Warmup1.a19_HasTeen;

public class Main {
    public static void main(String[] args) {
        HasTeen hasTeen=new HasTeen();

        System.out.println(hasTeen.hasTeen(13, 20, 10));
        System.out.println(hasTeen.hasTeen(20, 19, 10));
        System.out.println(hasTeen.hasTeen(20, 119, 10));
        System.out.println(hasTeen.hasTeen(20, 10, 13));
    }
}
