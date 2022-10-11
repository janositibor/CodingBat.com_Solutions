package Session01_Warmup1.a21_DelDel;

public class Main {
    public static void main(String[] args) {
        DelDel delDel=new DelDel();

        System.out.println(delDel.delDel(null));
        System.out.println(delDel.delDel(""));
        System.out.println(delDel.delDel("a"));
        System.out.println(delDel.delDel("ade"));
        System.out.println(delDel.delDel("adelbc"));
        System.out.println(delDel.delDel("adelHello"));
        System.out.println(delDel.delDel("adedbc"));
    }
}
