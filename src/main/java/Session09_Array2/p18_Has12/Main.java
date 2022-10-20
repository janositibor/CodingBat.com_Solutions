package Session09_Array2.p18_Has12;

public class Main {
    public static void main(String[] args) {
        Has12 has12=new Has12();

        System.out.println(has12.has12(new int[]{1, 3, 2}));
        System.out.println(has12.has12(new int[]{3, 1, 2}));
        System.out.println(has12.has12(new int[]{3, 1, 4, 5, 2}));
        System.out.println(has12.has12(new int[]{2, 1, 4, 5, 3}));
        System.out.println(has12.has12(new int[]{}));
        System.out.println(has12.has12(new int[]{1}));
    }
}
