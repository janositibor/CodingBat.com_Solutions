package Session09_Array2.p34_FizzBuzz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz=new FizzBuzz();

        System.out.println(Arrays.toString(fizzBuzz.fizzBuzz(1,6)));
        System.out.println(Arrays.toString(fizzBuzz.fizzBuzz(1,8)));
        System.out.println(Arrays.toString(fizzBuzz.fizzBuzz(1,11)));
        System.out.println(Arrays.toString(fizzBuzz.fizzBuzz(0,17)));
    }
}
