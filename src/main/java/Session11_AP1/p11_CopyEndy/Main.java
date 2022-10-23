package Session11_AP1.p11_CopyEndy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CopyEndy copyEndy=new CopyEndy();

        System.out.println(Arrays.toString(copyEndy.copyEndy(new int[]{9, 11, 90, 22, 6},2)));
        System.out.println(Arrays.toString(copyEndy.copyEndy(new int[]{9, 11, 90, 22, 6},3)));
        System.out.println(Arrays.toString(copyEndy.copyEndy(new int[]{12, 1, 1, 13, 0, 20},2)));
    }
}
