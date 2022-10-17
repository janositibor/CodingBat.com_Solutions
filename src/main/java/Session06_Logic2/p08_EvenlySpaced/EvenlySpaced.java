package Session06_Logic2.p08_EvenlySpaced;

import java.util.Arrays;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int [] tempArray = new int [] {a, b, c};
        Arrays.sort(tempArray);
        return(tempArray[0]+tempArray[2]==2*tempArray[1]);
    }
}
