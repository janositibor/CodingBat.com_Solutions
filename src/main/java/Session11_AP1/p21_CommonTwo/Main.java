package Session11_AP1.p21_CommonTwo;

public class Main {
    public static void main(String[] args) {
        CommonTwo commonTwo=new CommonTwo();

        System.out.println(commonTwo.commonTwo(new String[]{"a", "c", "x"},new String[]{"b", "c", "d", "x"}));
        System.out.println(commonTwo.commonTwo(new String[]{"a", "c", "x"},new String[]{"a", "b", "c", "d", "x", "z"}));
        System.out.println(commonTwo.commonTwo(new String[]{"a", "b", "c"},new String[]{"a", "b", "c"}));
    }
}
