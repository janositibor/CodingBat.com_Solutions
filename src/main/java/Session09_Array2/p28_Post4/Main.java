package Session09_Array2.p28_Post4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Post4 post4=new Post4();

        System.out.println(Arrays.toString(post4.post4(new int[]{2, 4, 1, 2})));
        System.out.println(Arrays.toString(post4.post4(new int[]{4, 1, 4, 2})));
        System.out.println(Arrays.toString(post4.post4(new int[]{4, 4, 1, 2, 3})));
        System.out.println(Arrays.toString(post4.post4(new int[]{4})));
        System.out.println(Arrays.toString(post4.post4(new int[]{1})));
        System.out.println(Arrays.toString(post4.post4(new int[]{})));
    }
}
