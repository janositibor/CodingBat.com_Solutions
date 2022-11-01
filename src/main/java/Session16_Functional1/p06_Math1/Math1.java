package Session16_Functional1.p06_Math1;

import java.util.List;

public class Math1 {
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n->10*(n+1));
        return nums;
    }
}
