package Session05_Logic1.p13_NearTen;

public class NearTen {
    public boolean nearTen(int num) {
        int limit=2;
        return (num%10<=limit || num%10>=10-limit);
    }
}
