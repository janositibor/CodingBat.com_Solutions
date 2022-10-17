package Session05_Logic1.p26_RedTicket;

public class Main {
    public static void main(String[] args) {
        RedTicket redTicket=new RedTicket();

        System.out.println(redTicket.redTicket(2, 2, 2));
        System.out.println(redTicket.redTicket(2, 2, 1));
        System.out.println(redTicket.redTicket(1, 2, 2));
        System.out.println(redTicket.redTicket(0, 0, 0));
    }
}
