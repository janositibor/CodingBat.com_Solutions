package Session16_Functional1.p03_AddStar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AddStar addStar=new AddStar();

        System.out.println(addStar.addStar(Arrays.asList("a", "bb", "ccc")));
        System.out.println(addStar.addStar(Arrays.asList("hello", "there")));
        System.out.println(addStar.addStar(Arrays.asList("*")));
    }
}
