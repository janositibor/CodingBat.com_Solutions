package Session11_AP1.p06_WordsFront;

public class WordsFront {
    public String[] wordsFront(String[] words, int n) {
        String[] output=new String[n];
        for (int i = 0; i < n; i++) {
            output[i]=words[i];
        }
        return output;
    }
}
