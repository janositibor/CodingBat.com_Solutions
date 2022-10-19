package Session08_String3.p10_SumNumbers;

public class SumNumbers{
    public int sumNumbers(String str) {
        int sum=0;
        int actualvalue=0;
        char charActual;
        for(int i=0;i<str.length();i++){
            charActual=str.charAt(i);
            if(Character.isDigit(charActual)){
                actualvalue=10*actualvalue+Integer.parseInt(String.valueOf(charActual));
            }
            else{
                sum+=actualvalue;
                actualvalue=0;
            }
        }
        sum+=actualvalue;
        return sum;
    }
}
