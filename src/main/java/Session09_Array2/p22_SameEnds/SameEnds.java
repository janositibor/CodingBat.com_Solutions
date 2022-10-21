package Session09_Array2.p22_SameEnds;

public class SameEnds {
    public boolean sameEnds(int[] nums, int len) {
        int front=0;
        int back=0;
        for (int i=0;i<len;i++){
            front=10*front+nums[i];
            back=10*back+nums[nums.length-len+i];
        }
        return front==back;
    }
}
