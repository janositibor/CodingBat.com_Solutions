package Session01_Warmup1.a02_MonkeyTrouble;

public class Main {

    public static void main(String[] args) {
        MonkeyTrouble monkeyTrouble=new MonkeyTrouble();

        System.out.println(monkeyTrouble.monkeyTrouble(false, false));
        System.out.println(monkeyTrouble.monkeyTrouble(false, true));
        System.out.println(monkeyTrouble.monkeyTrouble(true, false));
        System.out.println(monkeyTrouble.monkeyTrouble(true, true));
    }
}
