package Session09_Array2.p27_Pre4;

import java.util.ArrayList;
import java.util.List;

public class Pre4 {
    public int[] pre4(int[] nums) {
        List<Integer> numbersList = new ArrayList<Integer>();
        boolean found4=false;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==4){
                found4=true;
                break;
            }
            numbersList.add(nums[i]);
        }
        if(!found4){
            numbersList.clear();
        }
        int[] numbersArray = new int[numbersList.size()];
        for(int i=0;i<numbersList.size();i++){
            numbersArray[i]=numbersList.get(i);
        }
        return numbersArray;
    }
}
