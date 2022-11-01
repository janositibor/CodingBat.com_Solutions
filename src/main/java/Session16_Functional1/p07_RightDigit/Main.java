package Session16_Functional1.p07_RightDigit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RightDigit rightDigit=new RightDigit();

        System.out.println(rightDigit.rightDigit(Arrays.asList(1, 22, 93)));
        System.out.println(rightDigit.rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
        System.out.println(rightDigit.rightDigit(Arrays.asList(10, 0)));
    }
}
