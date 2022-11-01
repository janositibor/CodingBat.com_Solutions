package Session17_Functional2.p08_Two2;

import java.util.List;

public class Two2 {
    public List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n->2*n);
        nums.removeIf(n->n%10==2);
        return nums;
    }
}
