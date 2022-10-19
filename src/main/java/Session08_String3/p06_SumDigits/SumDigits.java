package Session08_String3.p06_SumDigits;

public class SumDigits {
    public int sumDigits(String str) {
        int sum=0;
        char charActual;
        for(int i=0;i<str.length();i++){
            charActual=str.charAt(i);
            if(Character.isDigit(charActual)){
                sum+=Integer.parseInt(String.valueOf(charActual));
            }
        }
        return sum;
    }
}
