package Session09_Array2.p03_CenteredAverage;

public class Main {
    public static void main(String[] args) {
        CenteredAverage centeredAverage=new CenteredAverage();

        System.out.println(centeredAverage.centeredAverage(new int[]{1, 2, 3, 4, 100}));
        System.out.println(centeredAverage.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(centeredAverage.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }
}
