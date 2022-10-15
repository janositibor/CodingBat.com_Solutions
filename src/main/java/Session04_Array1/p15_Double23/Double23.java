package Session04_Array1.p15_Double23;

public class Double23 {
    public boolean double23(int[] nums) {
        int[] temp=new int[2];

        for(int element:nums){
            if(2<=element && element<=3){
                temp[element-2]++;
            }
        }
        return temp[0]>1 || temp[1]>1;
    }
}
