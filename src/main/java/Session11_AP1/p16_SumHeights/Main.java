package Session11_AP1.p16_SumHeights;

public class Main {
    public static void main(String[] args) {
        SumHeights sumHeights=new SumHeights();

        System.out.println(sumHeights.sumHeights(new int[]{5, 3, 6, 7, 2},2,4));
        System.out.println(sumHeights.sumHeights(new int[]{5, 3, 6, 7, 2},0,1));
        System.out.println(sumHeights.sumHeights(new int[]{5, 3, 6, 7, 2},0,4));
    }
}
