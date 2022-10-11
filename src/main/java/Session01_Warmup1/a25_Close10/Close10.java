package Session01_Warmup1.a25_Close10;

public class Close10 {
    public int close10(int a, int b) {
        int reference=10;
        if(Math.abs(a-reference)==Math.abs(b-reference)){
            return 0;
        }
        return Math.abs(a-reference)<Math.abs(b-reference)?a:b;
    }
}
