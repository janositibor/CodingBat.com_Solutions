package Session12_Recursion1.p28_StrCount;

public class Main {
    public static void main(String[] args) {
        StrCount strCount=new StrCount();

        System.out.println(strCount.strCount("catcowcat", "cat"));
        System.out.println(strCount.strCount("catcowcat", "cow"));
        System.out.println(strCount.strCount("catcowcat", "dog"));
        System.out.println(strCount.strCount("cacatcowcat", "cat"));
    }
}
