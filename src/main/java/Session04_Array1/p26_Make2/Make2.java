package Session04_Array1.p26_Make2;

public class Make2 {
    public int[] make2(int[] a, int[] b) {
        int[] output=new int[2];
        int lengthFromA=Math.min(2,a.length);
        for(int i=0; i<lengthFromA;i++){
            output[i]=a[i];
        }
        for(int i=0;i<(2-lengthFromA);i++){
            output[i+lengthFromA]=b[i];
        }
        return output;
    }
}
