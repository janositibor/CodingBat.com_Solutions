package Session14_Map1.p05_Topping2;

import java.util.Map;

public class Topping2 {
    public Map<String, String> topping2(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("yogurt",map.get("ice cream"));
        }
        if(map.containsKey("spinach")){
            map.put("spinach","nuts");
        }
        return map;
    }
}
