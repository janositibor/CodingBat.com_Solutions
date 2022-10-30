package Session14_Map1.p08_MapAB3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MapAB3 mapAB3=new MapAB3();

        System.out.println(mapAB3.mapAB3(new HashMap<>(Map.of("a", "aaa", "c", "cake"))));
        System.out.println(mapAB3.mapAB3(new HashMap<>(Map.of("b", "bbb", "c", "cake"))));
        System.out.println(mapAB3.mapAB3(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"))));
    }
}
