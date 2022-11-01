package Session15_Map2.p09_FirstSwap;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i=0;i<strings.length;i++) {
            if(strings[i].length()>0){
                String s=strings[i].substring(0,1);
                if(map.containsKey(s)){
                    if(map.get(s)>-1) {
                        swap(strings, map.get(s), i);
                        map.put(s, -1);
                    }
                }
                else{
                    map.put(s,i);
                }
            }
        }
        return strings;
    }
    private String[] swap(String[] strings, int index1, int index2){
        String temp=strings[index1];
        strings[index1]=strings[index2];
        strings[index2]=temp;
        return strings;
    }
}
