package Session04_Array1.p17_Start1;

public class Start1 {
    public int start1(int[] a, int[] b) {
        int output=0;
        if(a.length>0 && a[0]==1){
            output++;
        }
        if(b.length>0 && b[0]==1){
           output++;
        }
        return output;
    }
}
