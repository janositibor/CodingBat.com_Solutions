package Session05_Logic1.p19_TwoAsOne;

public class TwoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        return (a+b==c || a+c==b || b+c==a);
    }
}
