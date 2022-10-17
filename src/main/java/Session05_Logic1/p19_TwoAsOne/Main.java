package Session05_Logic1.p19_TwoAsOne;

public class Main {
    public static void main(String[] args) {
        TwoAsOne twoAsOne=new TwoAsOne();

        System.out.println(twoAsOne.twoAsOne(1, 2, 3));
        System.out.println(twoAsOne.twoAsOne(3, 1, 2));
        System.out.println(twoAsOne.twoAsOne(3, 2, 2));
        System.out.println(twoAsOne.twoAsOne(3, 5, -2));
    }
}
