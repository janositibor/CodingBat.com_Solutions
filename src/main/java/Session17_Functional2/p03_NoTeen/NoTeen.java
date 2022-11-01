package Session17_Functional2.p03_NoTeen;

import java.util.List;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n-> (13<=n && n<=19));
        return nums;
    }
}
