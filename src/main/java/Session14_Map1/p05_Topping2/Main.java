package Session14_Map1.p05_Topping2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Topping2 topping2=new Topping2();

        System.out.println(topping2.topping2(new HashMap<>(Map.of("ice cream", "cherry"))));
        System.out.println(topping2.topping2(new HashMap<>(Map.of("ice cream", "cherry","spinach", "dirt"))));
        System.out.println(topping2.topping2(new HashMap<>(Map.of("yogurt", "salt"))));
    }
}
