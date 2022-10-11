package Session01_Warmup1.a17_IcyHot;

public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        return Math.min(temp1,temp2)<0 && Math.max(temp1,temp2)>100;
    }
}
