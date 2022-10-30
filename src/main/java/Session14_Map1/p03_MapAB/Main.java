package Session14_Map1.p03_MapAB;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MapAB mapAB=new MapAB();

        System.out.println(mapAB.mapAB(new HashMap<>(Map.of("a", "Hi", "b", "There"))));
        System.out.println(mapAB.mapAB(new HashMap<>(Map.of("a", "Hi"))));
        System.out.println(mapAB.mapAB(new HashMap<>(Map.of("b", "There"))));
    }
}
