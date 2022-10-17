package Session06_Logic2.p07_Blackjack;

public class Main {
    public static void main(String[] args) {
        Blackjack blackjack=new Blackjack();

        System.out.println(blackjack.blackjack(19, 21));
        System.out.println(blackjack.blackjack(21, 19));
        System.out.println(blackjack.blackjack(19, 22));
        System.out.println(blackjack.blackjack(23, 22));
    }
}
