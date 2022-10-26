package Session12_Recursion1.p22_CountAbc;

public class Main {
    public static void main(String[] args) {
        CountAbc countAbc=new CountAbc();

        System.out.println(countAbc.countAbc("abc"));
        System.out.println(countAbc.countAbc("abcxxabc"));
        System.out.println(countAbc.countAbc("ababaxxaba"));
    }
}
