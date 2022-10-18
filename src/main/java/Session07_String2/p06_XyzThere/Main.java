package Session07_String2.p06_XyzThere;

public class Main {
    public static void main(String[] args) {
        XyzThere xyzThere=new XyzThere();

        System.out.println(xyzThere.xyzThere("abcxyz"));
        System.out.println(xyzThere.xyzThere("abc.xyz"));
        System.out.println(xyzThere.xyzThere("xyz.abc"));
        System.out.println(xyzThere.xyzThere("xyz"));
    }
}
