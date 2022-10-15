package Session04_Array1.p02_SameFirstLast;

public class Main {
    public static void main(String[] args) {
        SameFirstLast sameFirstLast=new SameFirstLast();

        System.out.println(sameFirstLast.sameFirstLast(new int[]{1, 2, 6}));
        System.out.println(sameFirstLast.sameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println(sameFirstLast.sameFirstLast(new int[]{1, 2, 1}));
    }
}
