package Session15_Map2.p06_WordAppend;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String output="";
        for (String s:strings) {
            if(!map.containsKey(s)){
                map.put(s,0);
            }
            map.put(s,map.get(s)+1);
            if(map.get(s)%2==0) {
                output += s;
            }
        }
        return output;
    }
}
