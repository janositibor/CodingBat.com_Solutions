package Session09_Array2.p29_NotAlone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NotAlone notAlone=new NotAlone();

        System.out.println(Arrays.toString(notAlone.notAlone(new int[]{1, 2, 3},2)));
        System.out.println(Arrays.toString(notAlone.notAlone(new int[]{1, 2, 3, 2, 5, 2},2)));
        System.out.println(Arrays.toString(notAlone.notAlone(new int[]{3, 4},3)));
    }
}
