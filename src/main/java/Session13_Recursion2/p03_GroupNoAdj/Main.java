package Session13_Recursion2.p03_GroupNoAdj;

public class Main {
    public static void main(String[] args) {
        GroupNoAdj groupNoAdj=new GroupNoAdj();

        System.out.println(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4},12));
        System.out.println(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4},14));
        System.out.println(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4},7));
    }
}
