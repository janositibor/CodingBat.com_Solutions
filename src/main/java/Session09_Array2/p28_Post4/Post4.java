package Session09_Array2.p28_Post4;

import java.util.ArrayList;
import java.util.List;

public class Post4 {
    public int[] post4(int[] nums) {
        List<Integer> numbersList = new ArrayList<Integer>();
        boolean found4=false;

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==4){
                found4=true;
                break;
            }
            numbersList.add(nums[i]);
        }
        if(!found4){
            numbersList.clear();
        }
        int length=numbersList.size();
        int[] numbersArray = new int[length];
        for(int i=0;i<length;i++){
            numbersArray[length-1-i]=numbersList.get(i);
        }
        return numbersArray;
    }
}
