package Session11_AP1.p14_WordsWithout;

import java.util.ArrayList;
import java.util.List;

public class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        List<String> wordsList = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if(!target.equals(words[i])){
                wordsList.add(words[i]);
            }
        }
        return wordsList.toArray(new String[wordsList.size()]) ;
    }
}
