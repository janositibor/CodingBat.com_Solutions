package Session05_Logic1.p09_SpecialEleven;

public class SpecialEleven {
    public boolean specialEleven(int n) {
        int mod=n%11;
        return mod==0 || mod==1;
    }
}
