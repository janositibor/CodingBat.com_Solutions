package Session15_Map2.p05_FirstChar;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        String firstChar;
        for (String s:strings) {
            firstChar=s.substring(0,1);
            if(!map.containsKey(firstChar)){
                map.put(firstChar,"");
            }
            map.put(firstChar,map.get(firstChar)+s);
        }
        return map;
    }
}
