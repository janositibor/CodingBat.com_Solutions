package Session14_Map1.p04_Topping1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Topping1 topping1=new Topping1();

        System.out.println(topping1.topping1(new HashMap<>(Map.of("ice cream", "peanuts"))));
        System.out.println(topping1.topping1(new HashMap<>(Map.of())));
        System.out.println(topping1.topping1(new HashMap<>(Map.of("pancake", "syrup"))));
    }
}
