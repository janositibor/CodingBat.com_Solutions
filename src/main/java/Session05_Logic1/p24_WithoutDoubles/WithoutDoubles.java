package Session05_Logic1.p24_WithoutDoubles;

public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        return (noDoubles && die1==die2)?die1+(die2%6)+1:die1+die2;
    }
}
