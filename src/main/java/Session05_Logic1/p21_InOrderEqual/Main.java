package Session05_Logic1.p21_InOrderEqual;

public class Main {
    public static void main(String[] args) {
        InOrderEqual inOrderEqual=new InOrderEqual();

        System.out.println(inOrderEqual.inOrderEqual(2, 5, 11, false));
        System.out.println(inOrderEqual.inOrderEqual(5, 7, 6, false));
        System.out.println(inOrderEqual.inOrderEqual(5, 5, 7, true));
    }
}
