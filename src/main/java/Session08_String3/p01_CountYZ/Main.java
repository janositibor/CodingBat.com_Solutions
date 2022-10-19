package Session08_String3.p01_CountYZ;

public class Main {
    public static void main(String[] args) {
        CountYZ countYZ=new CountYZ();

        System.out.println(countYZ.countYZ("fez day"));
        System.out.println(countYZ.countYZ("day fez"));
        System.out.println(countYZ.countYZ("day fyyyz"));
        System.out.println(countYZ.countYZ("DAY abc XYZ"));
    }
}
