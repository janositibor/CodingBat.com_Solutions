package Session12_Recursion1.p27_NestParen;

public class Main {
    public static void main(String[] args) {
        NestParen nestParen=new NestParen();
        System.out.println(nestParen.nestParen("(())"));
        System.out.println(nestParen.nestParen(""));
        System.out.println(nestParen.nestParen("()"));
        System.out.println(nestParen.nestParen("((xx))"));
        System.out.println(nestParen.nestParen("x(x(xx))"));
        System.out.println(nestParen.nestParen("xx(xx))"));
        System.out.println(nestParen.nestParen("(yy)"));
    }
}
