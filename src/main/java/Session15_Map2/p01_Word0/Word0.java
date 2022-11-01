package Session15_Map2.p01_Word0;

import java.util.HashMap;
import java.util.Map;

public class Word0 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s:strings) {
            if(!map.containsKey(s)){
                map.put(s,0);
            }
        }
        return map;
    }
}
