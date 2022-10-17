package Session06_Logic2.p01_MakeBricks;

public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int smallValue=1;
        int bigValue=5;

        if(big*bigValue+small*smallValue<goal){
            return false;
        }
        return((goal%bigValue)<=small)?true:false;
    }
}
