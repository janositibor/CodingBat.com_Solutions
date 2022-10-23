package Session11_AP1.p21_CommonTwo;

import java.util.Arrays;

public class CommonTwo {
    public int commonTwo(String[] a, String[] b) {
        String[] temp=new String[Math.min(a.length,b.length)];
        int indexA=0;
        int indexB=0;
        int index=0;
        int aBeforeB;
        while(indexA<a.length && indexB<b.length){
            aBeforeB=a[indexA].compareTo(b[indexB]);
            if(aBeforeB==0){
                if(index==0 || temp[index-1].compareTo(a[indexA])!=0){
                    temp[index]=a[indexA];
                    index++;
                }
                indexA++;
                indexB++;
            }
            else{
                if(aBeforeB<0){
                    indexA++;
                }
                if(aBeforeB>0){
                    indexB++;
                }
            }
        }
        return index;
    }
}
