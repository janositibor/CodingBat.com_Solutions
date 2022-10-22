package Session11_AP1.p07_WordsWithoutList;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        List<String> outputList = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()!=len){
                outputList.add(words[i]);
            }
        }
        return outputList;
    }
}
