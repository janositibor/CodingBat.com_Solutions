package Session14_Map1.p02_MapShare;

import java.util.Map;

public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
