package Session17_Functional2.p02_No9;

import java.util.List;

public class No9 {
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n-> (n%10==9));
        return nums;
    }
}
