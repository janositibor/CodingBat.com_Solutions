package Session04_Array1.p25_Unlucky1;

public class Main {
    public static void main(String[] args) {
        Unlucky1 unlucky1=new Unlucky1();

        System.out.println(unlucky1.unlucky1(new int[]{1, 3, 4, 5}));
        System.out.println(unlucky1.unlucky1(new int[]{1, 1, 4, 5}));
        System.out.println(unlucky1.unlucky1(new int[]{2, 1, 3, 4, 5}));
        System.out.println(unlucky1.unlucky1(new int[]{2, 2, 1, 3, 4, 5}));
        System.out.println(unlucky1.unlucky1(new int[]{1, 1, 1}));
        System.out.println(unlucky1.unlucky1(new int[]{1, 1, 1, 3, 1, 3}));
    }
}
