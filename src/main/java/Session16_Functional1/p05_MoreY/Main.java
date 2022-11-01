package Session16_Functional1.p05_MoreY;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MoreY moreY=new MoreY();

        System.out.println(moreY.moreY(Arrays.asList("a", "b", "c")));
        System.out.println(moreY.moreY(Arrays.asList("hello", "there")));
        System.out.println(moreY.moreY(Arrays.asList("yay")));
    }
}
