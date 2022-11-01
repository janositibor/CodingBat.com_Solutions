package Session15_Map2.p08_AllSwap;

import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i=0;i<strings.length;i++) {
            if(strings[i].length()>0){
                String s=strings[i].substring(0,1);
                if(map.containsKey(s)){
                    swap(strings,map.get(s),i);
                    map.remove(s);
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
