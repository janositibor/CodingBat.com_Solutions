package Session15_Map2.p09_FirstSwap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FirstSwap firstSwap=new FirstSwap();

        System.out.println(Arrays.toString(firstSwap.firstSwap(new String[]{"ab", "ac"})));
        System.out.println(Arrays.toString(firstSwap.firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        System.out.println(Arrays.toString(firstSwap.firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
    }
}
