package Session14_Map1.p07_MapAB2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MapAB2 mapAB2=new MapAB2();

        System.out.println(mapAB2.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"))));
        System.out.println(mapAB2.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb"))));
        System.out.println(mapAB2.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"))));
    }
}
