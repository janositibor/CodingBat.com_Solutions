package Session14_Map1.p06_Topping3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Topping3 topping3=new Topping3();

        System.out.println(topping3.topping3(new HashMap<>(Map.of("potato", "ketchup"))));
        System.out.println(topping3.topping3(new HashMap<>(Map.of("salad", "oil", "potato", "ketchup"))));
    }
}
