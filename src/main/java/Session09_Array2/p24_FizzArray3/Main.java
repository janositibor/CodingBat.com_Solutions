package Session09_Array2.p24_FizzArray3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FizzArray3 fizzArray3=new FizzArray3();

        System.out.println(Arrays.toString(fizzArray3.fizzArray3(4,9)));
        System.out.println(Arrays.toString(fizzArray3.fizzArray3(5, 10)));
        System.out.println(Arrays.toString(fizzArray3.fizzArray3(11, 18)));
        System.out.println(Arrays.toString(fizzArray3.fizzArray3(1, 3)));
        System.out.println(Arrays.toString(fizzArray3.fizzArray3(1, 1)));
    }
}
