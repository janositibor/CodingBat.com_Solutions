package Session16_Functional1.p08_Lower;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lower lower=new Lower();

        System.out.println(lower.lower(Arrays.asList("Hello", "Hi")));
        System.out.println(lower.lower(Arrays.asList("AAA", "BBB", "ccc")));
        System.out.println(lower.lower(Arrays.asList("KitteN", "ChocolaTE")));
    }
}
