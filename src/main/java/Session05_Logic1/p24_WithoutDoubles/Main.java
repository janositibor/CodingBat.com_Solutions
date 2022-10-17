package Session05_Logic1.p24_WithoutDoubles;

public class Main {
    public static void main(String[] args) {
        WithoutDoubles withoutDoubles=new WithoutDoubles();

        System.out.println(withoutDoubles.withoutDoubles(2, 3, true));
        System.out.println(withoutDoubles.withoutDoubles(3, 3, true));
        System.out.println(withoutDoubles.withoutDoubles(3, 3, false));
        System.out.println(withoutDoubles.withoutDoubles(6, 6, true));
        System.out.println(withoutDoubles.withoutDoubles(5, 5, true));
    }
}
