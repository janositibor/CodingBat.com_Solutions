package Session09_Array2.p20_HaveThree;

public class Main {
    public static void main(String[] args) {
        HaveThree haveThree=new HaveThree();

        System.out.println(haveThree.haveThree(new int[]{3, 1, 3, 1, 3}));
        System.out.println(haveThree.haveThree(new int[]{3, 1, 3, 3}));
        System.out.println(haveThree.haveThree(new int[]{3, 4, 3, 3, 4}));
    }
}
