package Session16_Functional1.p01_Doubling;

import java.util.List;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> 2*n);
        return nums;
    }
}
