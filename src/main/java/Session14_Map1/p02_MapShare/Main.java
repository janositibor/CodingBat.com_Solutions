package Session14_Map1.p02_MapShare;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MapShare mapShare=new MapShare();

        System.out.println(mapShare.mapShare(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "ccc"))));
        System.out.println(mapShare.mapShare(new HashMap<>(Map.of("b", "xyz", "c", "ccc"))));
        System.out.println(mapShare.mapShare(new HashMap<>(Map.of("a", "aaa", "d", "hi", "c", "meh"))));
    }
}
