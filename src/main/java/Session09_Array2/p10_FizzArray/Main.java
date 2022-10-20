package Session09_Array2.p10_FizzArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FizzArray fizzArray=new FizzArray();

        System.out.println(Arrays.toString(fizzArray.fizzArray(4)));
        System.out.println(Arrays.toString(fizzArray.fizzArray(1)));
        System.out.println(Arrays.toString(fizzArray.fizzArray(0)));
        System.out.println(Arrays.toString(fizzArray.fizzArray(10)));
    }
}
