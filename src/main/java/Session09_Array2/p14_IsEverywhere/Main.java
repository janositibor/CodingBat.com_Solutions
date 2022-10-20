package Session09_Array2.p14_IsEverywhere;

public class Main {
    public static void main(String[] args) {
        IsEverywhere isEverywhere=new IsEverywhere();

        System.out.println(isEverywhere.isEverywhere(new int[]{1, 2, 1, 3},1));
        System.out.println(isEverywhere.isEverywhere(new int[]{1, 2, 1, 3},2));
        System.out.println(isEverywhere.isEverywhere(new int[]{1, 2, 1, 3,4},1));
    }
}
