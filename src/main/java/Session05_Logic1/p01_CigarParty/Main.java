package Session05_Logic1.p01_CigarParty;

public class Main {
    public static void main(String[] args) {
        CigarParty cigarParty=new CigarParty();

        System.out.println(cigarParty.cigarParty(30, false));
        System.out.println(cigarParty.cigarParty(50, false));
        System.out.println(cigarParty.cigarParty(70, true));
    }
}
