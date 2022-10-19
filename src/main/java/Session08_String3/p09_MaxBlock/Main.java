package Session08_String3.p09_MaxBlock;

public class Main {
    public static void main(String[] args) {
        MaxBlock maxBlock=new MaxBlock();

        System.out.println(maxBlock.maxBlock("hoopla"));
        System.out.println(maxBlock.maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock.maxBlock(""));
        System.out.println(maxBlock.maxBlock("xyzz"));
    }
}
