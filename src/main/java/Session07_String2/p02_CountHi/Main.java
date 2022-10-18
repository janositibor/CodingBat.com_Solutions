package Session07_String2.p02_CountHi;

public class Main {
    public static void main(String[] args) {
        CountHi countHi=new CountHi();

        System.out.println(countHi.countHi("abc hi ho"));
        System.out.println(countHi.countHi("ABChi hi"));
        System.out.println(countHi.countHi("hihihi"));
        System.out.println(countHi.countHi("cccccccc"));
        System.out.println(countHi.countHi(""));
    }
}
