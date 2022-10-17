package Session05_Logic1.p20_InOrder;

public class Main {
    public static void main(String[] args) {
        InOrder inOrder=new InOrder();

        System.out.println(inOrder.inOrder(1, 2, 4, false));
        System.out.println(inOrder.inOrder(1, 2, 1, false));
        System.out.println(inOrder.inOrder(1, 1, 2, true));
    }
}
