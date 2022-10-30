package Session14_Map1.p09_MapAB4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MapAB4 mapAB4=new MapAB4();

        System.out.println(mapAB4.mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))));
        System.out.println(mapAB4.mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"))));
        System.out.println(mapAB4.mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb"))));
        System.out.println(mapAB4.mapAB4(new HashMap<>(Map.of("a", "aa", "b", "b"))));
        System.out.println(mapAB4.mapAB4(new HashMap<>(Map.of("a", "aaa"))));
        System.out.println(mapAB4.mapAB4(new HashMap<>(Map.of("b", "bbb"))));
    }
}
