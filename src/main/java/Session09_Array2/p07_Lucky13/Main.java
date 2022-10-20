package Session09_Array2.p07_Lucky13;

public class Main {
    public static void main(String[] args) {
        Lucky13 lucky13=new Lucky13();

        System.out.println(lucky13.lucky13(new int[]{0, 2, 4}));
        System.out.println(lucky13.lucky13(new int[]{1, 2, 3}));
        System.out.println(lucky13.lucky13(new int[]{1, 2, 4}));
    }
}
