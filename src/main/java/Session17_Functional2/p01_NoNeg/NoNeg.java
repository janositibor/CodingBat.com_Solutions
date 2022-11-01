package Session17_Functional2.p01_NoNeg;

import java.util.List;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n-> (n<0));
        return nums;
    }
}
