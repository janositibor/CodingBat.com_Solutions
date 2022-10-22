package Session10_Array3.p05_LinearIn;

public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        if(inner.length>0 && inner[inner.length-1]>outer[outer.length-1]){
            return false;
        }

        int outerIndex=-1;
        for (int i = 0; i < inner.length; i++) {
            while(outerIndex<outer.length-1){
                outerIndex++;
                if(outer[outerIndex]==inner[i]){
                    break;
                }
                if(outer[outerIndex]>inner[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
