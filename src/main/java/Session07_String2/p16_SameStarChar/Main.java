package Session07_String2.p16_SameStarChar;

public class Main {
    public static void main(String[] args) {
        SameStarChar sameStarChar=new SameStarChar();

        System.out.println(sameStarChar.sameStarChar("xy*yzz"));
        System.out.println(sameStarChar.sameStarChar("xy*zzz"));
        System.out.println(sameStarChar.sameStarChar("*xa*az"));
    }
}
