package Session04_Array1.p17_Start1;

public class Main {
    public static void main(String[] args) {
        Start1 start1=new Start1();

        System.out.println(start1.start1(new int[]{1, 2, 3},new int[]{1, 3}));
        System.out.println(start1.start1(new int[]{7, 2, 3},new int[]{1}));
        System.out.println(start1.start1(new int[]{1, 2},new int[]{}));
        System.out.println(start1.start1(new int[]{},new int[]{}));
        System.out.println(start1.start1(new int[]{},new int[]{1}));
    }
}
