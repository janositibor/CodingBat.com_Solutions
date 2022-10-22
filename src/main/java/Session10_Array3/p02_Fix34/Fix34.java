package Session10_Array3.p02_Fix34;

public class Fix34 {
    public int[] fix34(int[] nums) {
        int index3=firstAppearanceFrom(nums,3,0);
        int index4;
        int temp;
        while(index3>-1 && index3<nums.length-1){
            index4=firstAppearanceFrom(nums,4,0);
            if(index4!=index3+1 && index4>0){
                temp=nums[index3+1];
                nums[index3+1]=nums[index4];
                nums[index4]=temp;
            }
            index3=firstAppearanceFrom(nums,3,index3+1);
        }
        return nums;

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
