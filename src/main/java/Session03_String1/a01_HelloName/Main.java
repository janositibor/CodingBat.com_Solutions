package Session03_String1.a01_HelloName;

public class Main {
    public static void main(String[] args) {
        HelloName helloName=new HelloName();

        System.out.println(helloName.helloName("Bob"));
        System.out.println(helloName.helloName("Alice"));
        System.out.println(helloName.helloName("X"));
    }
}
