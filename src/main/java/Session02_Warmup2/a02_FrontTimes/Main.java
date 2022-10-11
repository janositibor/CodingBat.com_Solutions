package Session02_Warmup2.a02_FrontTimes;

public class Main {
    public static void main(String[] args) {
        FrontTimes frontTimes=new FrontTimes();

        System.out.println(frontTimes.frontTimes("Chocolate", 2));
        System.out.println(frontTimes.frontTimes("Chocolate", 3));
        System.out.println(frontTimes.frontTimes("", 3));
        System.out.println(frontTimes.frontTimes("x", 3));
        System.out.println(frontTimes.frontTimes("x", 0));
        System.out.println(frontTimes.frontTimes("Abc", 3));
    }
}
