package Session04_Array1.p24_FrontPiece;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FrontPiece frontPiece=new FrontPiece();

        System.out.println(Arrays.toString(frontPiece.frontPiece(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(frontPiece.frontPiece(new int[]{1, 2})));
        System.out.println(Arrays.toString(frontPiece.frontPiece(new int[]{1})));
        System.out.println(Arrays.toString(frontPiece.frontPiece(new int[]{})));
    }
}
