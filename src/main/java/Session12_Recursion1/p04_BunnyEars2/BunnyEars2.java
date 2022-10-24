package Session12_Recursion1.p04_BunnyEars2;

public class BunnyEars2 {
    public int bunnyEars2(int bunnies) {
        if(bunnies==0 || bunnies==1){
            return 2*bunnies;
        }
        return 5+bunnyEars2(bunnies-2);
    }
}
