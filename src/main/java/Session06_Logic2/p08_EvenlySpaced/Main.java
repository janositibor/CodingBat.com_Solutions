package Session06_Logic2.p08_EvenlySpaced;

public class Main {
    public static void main(String[] args) {
        EvenlySpaced evenlySpaced=new EvenlySpaced();

        System.out.println(evenlySpaced.evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced.evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced.evenlySpaced(4, 6, 3));
    }
}
