package Session10_Array3.p08_MaxMirror;

public class Main {
    public static void main(String[] args) {
        MaxMirror maxMirror=new MaxMirror();

        System.out.println(maxMirror.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(maxMirror.maxMirror(new int[]{}));
        System.out.println(maxMirror.maxMirror(new int[]{1}));
        System.out.println(maxMirror.maxMirror(new int[]{1,1}));
        System.out.println(maxMirror.maxMirror(new int[]{1,1,1}));
        System.out.println(maxMirror.maxMirror(new int[]{1, 2, 1, 4}));
        System.out.println(maxMirror.maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }
}
