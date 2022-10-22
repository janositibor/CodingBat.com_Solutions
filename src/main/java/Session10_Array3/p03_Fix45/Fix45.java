package Session10_Array3.p03_Fix45;

public class Fix45 {
    public int[] fix45(int[] nums) {
        int index4=firstAppearanceFrom(nums,4,0);
        int index5;
        int temp;
        while(index4>-1 && index4<nums.length-1){
            index5=firstAppearanceFrom(nums,5,0);
            if(index5!=index4+1 && index5>-1){
                temp=nums[index4+1];
                nums[index4+1]=nums[index5];
                nums[index5]=temp;
            }
            index4=firstAppearanceFrom(nums,4,index4+1);
        }
        return nums;
    }
    private int firstAppearanceFrom(int[] nums, int element,int from){
        for (int i = from; i < nums.length; i++) {
            if(nums[i]==element){
                if(element==5 && i>0 && nums[i-1]==4){
                    continue;
                }
                return i;
            }
        }
        return -1;
    }
}
