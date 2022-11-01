package Session16_Functional1.p02_Square;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square square=new Square();

        System.out.println(square.square(Arrays.asList(1, 2, 3)));
        System.out.println(square.square(Arrays.asList(6, 8, -6, -8, 1)));
        System.out.println(square.square(Arrays.asList()));
    }
}
