package Session09_Array2.p01_CountEvens;

public class Main {
    public static void main(String[] args) {
        CountEvens countEvens=new CountEvens();

        System.out.println(countEvens.countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens.countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens.countEvens(new int[]{1, 3, 5}));
    }
}
