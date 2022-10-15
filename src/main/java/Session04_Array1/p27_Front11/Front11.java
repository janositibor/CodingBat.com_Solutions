package Session04_Array1.p27_Front11;

public class Front11 {
    public int[] front11(int[] a, int[] b) {
        int lengthFromA=Math.min(1,a.length);
        int lengthFromB=Math.min(1,b.length);
        int[] output=new int[lengthFromA+lengthFromB];

        int index=0;
        if(lengthFromA>0){
            output[index]=a[0];
            index++;
        }
        if(lengthFromB>0){
            output[index]=b[0];
        }
        return output;
    }
}
