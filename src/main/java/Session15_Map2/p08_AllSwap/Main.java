package Session15_Map2.p08_AllSwap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AllSwap allSwap=new AllSwap();

        System.out.println(Arrays.toString(allSwap.allSwap(new String[]{"ab", "ac"})));
        System.out.println(Arrays.toString(allSwap.allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        System.out.println(Arrays.toString(allSwap.allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
    }
}
