package Session14_Map1.p09_MapAB4;

import java.util.Map;

public class MapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            if(map.get("a").length()==map.get("b").length()){
                map.put("a","");
                map.put("b","");
                return map;
            }
            map.put("c",map.get("a").length()>map.get("b").length()?map.get("a"): map.get("b"));
        }
        return map;
    }
}
