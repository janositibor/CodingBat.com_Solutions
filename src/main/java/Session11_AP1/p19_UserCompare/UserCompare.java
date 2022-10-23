package Session11_AP1.p19_UserCompare;

public class UserCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        int nameOrder=aName.compareTo(bName);
        if(nameOrder==0){
            return sign(aId-bId);
        }
        return sign(nameOrder);
    }

    private int sign(int number){
        if(number==0){
            return 0;
        }
        return number/Math.abs(number);
    }
}
