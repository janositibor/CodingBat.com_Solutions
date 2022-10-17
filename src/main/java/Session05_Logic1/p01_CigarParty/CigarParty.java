package Session05_Logic1.p01_CigarParty;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return 40<=cigars && (isWeekend || cigars<=60);
    }
}
