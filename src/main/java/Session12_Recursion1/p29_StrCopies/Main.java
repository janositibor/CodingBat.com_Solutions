package Session12_Recursion1.p29_StrCopies;

public class Main {
    public static void main(String[] args) {
        StrCopies strCopies=new StrCopies();

        System.out.println(strCopies.strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies.strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies.strCopies("catcowcat", "cow", 1));
    }
}
