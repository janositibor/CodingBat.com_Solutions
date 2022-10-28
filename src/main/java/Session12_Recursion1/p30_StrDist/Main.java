package Session12_Recursion1.p30_StrDist;

public class Main {
    public static void main(String[] args) {
        StrDist strDist=new StrDist();

        System.out.println(strDist.strDist("catcowcat", "cat"));
        System.out.println(strDist.strDist("catcowcat", "cow"));
        System.out.println(strDist.strDist("cccatcowcatxx", "cat"));
        System.out.println(strDist.strDist("xyx", "z"));
        System.out.println(strDist.strDist("xyxy", "z"));
    }
}
