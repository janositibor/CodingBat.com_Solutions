package Session04_Array1.p20_PlusTwo;

public class PlusTwo {
    public int[] plusTwo(int[] a, int[] b) {
        int[] output=new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            output[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            output[a.length+i]=b[i];
        }

        return output;
    }
}
