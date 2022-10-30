package Session14_Map1.p03_MapAB;

import java.util.Map;

public class MapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab",map.get("a")+map.get("b"));
        }
        return map;
    }
}
