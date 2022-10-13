package Session03_String1.a23_ConCat;

public class Main {
    public static void main(String[] args) {
        ConCat conCat=new ConCat();

        System.out.println(conCat.conCat("abc", "cat"));
        System.out.println(conCat.conCat("dog", "cat"));
        System.out.println(conCat.conCat("abc", ""));
        System.out.println(conCat.conCat("", "abc"));
    }
}
