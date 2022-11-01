package Session15_Map2.p07_WordMultiple;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (String s:strings) {
            if(!map.containsKey(s)){
                map.put(s,false);
                continue;
            }
            map.put(s,true);
        }
        return map;
    }
}
