package Session10_Array3.p09_CountClumps;

public class Main {
    public static void main(String[] args) {
        CountClumps countClumps=new CountClumps();

        System.out.println(countClumps.countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps.countClumps(new int[]{1, 1, 2, 1, 1}));
        System.out.println(countClumps.countClumps(new int[]{1, 1, 1, 1, 1}));
        System.out.println(countClumps.countClumps(new int[]{1,1}));
        System.out.println(countClumps.countClumps(new int[]{1}));
        System.out.println(countClumps.countClumps(new int[]{}));
    }
}
