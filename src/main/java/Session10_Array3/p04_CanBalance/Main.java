package Session10_Array3.p04_CanBalance;

public class Main {
    public static void main(String[] args) {
        CanBalance canBalance=new CanBalance();

        System.out.println(canBalance.canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(canBalance.canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(canBalance.canBalance(new int[]{10, 10}));
    }
}
