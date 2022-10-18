package Session07_String2.p05_EndOther;

public class Main {
    public static void main(String[] args) {
        EndOther endOther=new EndOther();

        System.out.println(endOther.endOther("Hiabc", "abc"));
        System.out.println(endOther.endOther("AbC", "HiaBc"));
        System.out.println(endOther.endOther("abc", "abXabc"));
        System.out.println(endOther.endOther("abc", "abc"));
        System.out.println(endOther.endOther("abc", "abcx"));
    }
}
