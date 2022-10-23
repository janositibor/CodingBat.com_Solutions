package Session11_AP1.p19_UserCompare;

public class Main {
    public static void main(String[] args) {
        UserCompare userCompare=new UserCompare();

        System.out.println(userCompare.userCompare("bb", 1, "zz", 2));
        System.out.println(userCompare.userCompare("bb", 1, "aa", 2));
        System.out.println(userCompare.userCompare("bb", 1, "bb", 2));
        System.out.println(userCompare.userCompare("bb", 1, "bb", 1));
    }
}
