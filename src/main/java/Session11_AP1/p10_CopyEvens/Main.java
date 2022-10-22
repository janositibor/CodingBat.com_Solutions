package Session11_AP1.p10_CopyEvens;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CopyEvens copyEvens=new CopyEvens();

        System.out.println(Arrays.toString(copyEvens.copyEvens(new int[]{3, 2, 4, 5, 8},2)));
        System.out.println(Arrays.toString(copyEvens.copyEvens(new int[]{3, 2, 4, 5, 8},3)));
        System.out.println(Arrays.toString(copyEvens.copyEvens(new int[]{6, 1, 2, 4, 5, 8},3)));
    }
}
