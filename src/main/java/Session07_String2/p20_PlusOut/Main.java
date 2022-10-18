package Session07_String2.p20_PlusOut;

public class Main {
    public static void main(String[] args) {
        PlusOut plusOut=new PlusOut();

        System.out.println(plusOut.plusOut("12xy34", "xy"));
        System.out.println(plusOut.plusOut("12xy34", "1"));
        System.out.println(plusOut.plusOut("12xy34xyabcxy", "xy"));
    }
}
