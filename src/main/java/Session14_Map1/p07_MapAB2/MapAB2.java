package Session14_Map1.p07_MapAB2;

import java.util.Map;

public class MapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            if(map.get("a")!=null && map.get("b")!=null && map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}
