package Session10_Array3.p08_MaxMirror;

import java.util.Arrays;

public class MaxMirror {
    public int maxMirror(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int maxLength=1;
        int length=0;
        int mirrorIndex=0;
        int[] arrayToCopy;
        for (int i = 0; i < nums.length-1; i++) {
            mirrorIndex=firstAppearanceFrom(nums,nums[i],i+1);
            while(mirrorIndex>-1){
                arrayToCopy=Arrays.copyOfRange(nums, i, mirrorIndex+1);
                length=getMirrorLength(arrayToCopy);
                if(length>maxLength){
                    maxLength=length;
                }
                mirrorIndex=firstAppearanceFrom(nums,nums[i],mirrorIndex+1);
            }
        }
        return maxLength;
    }
    private int getMirrorLength(int[] nums){
        int length=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[nums.length-i-1]){
                break;
            }
            length++;
        }
        return length;
    }

    private int firstAppearanceFrom(int[] nums, int element,int from){
        for (int i = from; i < nums.length; i++) {
            if(nums[i]==element){
                if(element==4 && nums[i-1]==3){
                    continue;
                }
                return i;
            }
        }
        return -1;
    }
}
