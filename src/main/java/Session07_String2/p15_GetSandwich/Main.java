package Session07_String2.p15_GetSandwich;

public class Main {
    public static void main(String[] args) {
        GetSandwich getSandwich=new GetSandwich();

        System.out.println(getSandwich.getSandwich("breadjambread"));
        System.out.println(getSandwich.getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich.getSandwich("xxbreadyy"));
    }
}
