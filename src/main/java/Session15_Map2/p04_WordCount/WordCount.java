package Session15_Map2.p04_WordCount;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s:strings) {
            if(!map.containsKey(s)){
                map.put(s,0);
            }
            map.put(s,map.get(s)+1);
        }
        return map;
    }
}
