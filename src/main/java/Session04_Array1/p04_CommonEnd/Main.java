package Session04_Array1.p04_CommonEnd;

public class Main {
    public static void main(String[] args) {
        CommonEnd commonEnd=new CommonEnd();

        System.out.println(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        System.out.println(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
    }
}
