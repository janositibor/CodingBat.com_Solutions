package Session16_Functional1.p07_RightDigit;

import java.util.List;

public class RightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n->n%10);
        return nums;
    }
}
