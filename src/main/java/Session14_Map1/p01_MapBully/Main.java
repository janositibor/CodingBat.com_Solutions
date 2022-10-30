package Session14_Map1.p01_MapBully;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MapBully mapBully=new MapBully();

        System.out.println(mapBully.mapBully(new HashMap<>(Map.of("a", "candy", "b", "dirt"))));
        System.out.println(mapBully.mapBully(new HashMap<>(Map.of("a", "candy"))));
        System.out.println(mapBully.mapBully(new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh"))));
        System.out.println(mapBully.mapBully(new HashMap<>(Map.of("aa", "candy", "b", "carrot", "c", "meh"))));
    }
}
