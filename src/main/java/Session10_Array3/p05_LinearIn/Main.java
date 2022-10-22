package Session10_Array3.p05_LinearIn;

public class Main {
    public static void main(String[] args) {
        LinearIn linearIn=new LinearIn();

        System.out.println(linearIn.linearIn(new int[]{1, 2, 4, 6},new int[]{2, 4}));
        System.out.println(linearIn.linearIn(new int[]{1, 2, 4, 6},new int[]{2, 3, 4}));
        System.out.println(linearIn.linearIn(new int[]{1, 2, 4, 4, 6},new int[]{2, 4}));
        System.out.println(linearIn.linearIn(new int[]{2, 2, 2, 2, 2},new int[]{2, 4}));
        System.out.println(linearIn.linearIn(new int[]{1, 2, 3},new int[]{}));
    }
}
