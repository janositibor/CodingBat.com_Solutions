package Session09_Array2.p16_MatchUp;

public class MatchUp {
    public int matchUp(int[] nums1, int[] nums2) {
        int count=0;
        int difference;
        for (int i=0;i< nums1.length;i++){
            difference=Math.abs(nums1[i]-nums2[i]);
            if(0<difference && difference<=2){
                count++;
            }
        }
        return count;
    }
}
