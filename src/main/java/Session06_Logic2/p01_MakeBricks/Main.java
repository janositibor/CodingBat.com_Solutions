package Session06_Logic2.p01_MakeBricks;

public class Main {
    public static void main(String[] args) {
        MakeBricks makeBricks=new MakeBricks();

        System.out.println(makeBricks.makeBricks(3, 1, 8));
        System.out.println(makeBricks.makeBricks(3, 1, 9));
        System.out.println(makeBricks.makeBricks(3, 2, 10));
    }
}
