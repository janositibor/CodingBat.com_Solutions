package Session10_Array3.p01_MaxSpan;

import java.util.ArrayList;
import java.util.List;

public class MaxSpan {
    public int maxSpan(int[] nums) {
        List<Integer> numbersList = new ArrayList<Integer>();
        int output=0;
        int actual;
        int span;

        for (int i = 0; i < nums.length; i++) {
            actual=nums[i];
            if(!numbersList.contains(actual)){
                numbersList.add(actual);
                span=lastAppearance(nums,actual)-firstAppearance(nums,actual)+1;
                if(span>output){
                    output=span;
                }
            }
        }
        return output;
    }
    private int firstAppearance(int[] nums, int element){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==element){
                return i;
            }
        }
        return -1;
    }
    private int lastAppearance(int[] nums, int element){
        for (int i = nums.length-1; 0<=i; i--) {
            if(nums[i]==element){
                return i;
            }
        }
        return -1;
    }
}
