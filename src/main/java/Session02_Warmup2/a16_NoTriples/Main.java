package Session02_Warmup2.a16_NoTriples;

public class Main {
    public static void main(String[] args) {
        NoTriples noTriples=new NoTriples();

        System.out.println(noTriples.noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(noTriples.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples.noTriples(new int[]{1}));
        System.out.println(noTriples.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }
}
