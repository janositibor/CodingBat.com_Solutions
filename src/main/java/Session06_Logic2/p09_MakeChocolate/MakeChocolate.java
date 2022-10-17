package Session06_Logic2.p09_MakeChocolate;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int smallValue=1;
        int bigValue=5;

        if(big*bigValue+small*smallValue<goal){
            return -1;
        }

        if(goal-big*bigValue>0){
            return goal-big*bigValue;
        }

        int smallNeeded=goal%bigValue;
        return(smallNeeded<=small)?smallNeeded:-1;
    }
}
