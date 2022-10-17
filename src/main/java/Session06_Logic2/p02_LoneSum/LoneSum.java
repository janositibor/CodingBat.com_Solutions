package Session06_Logic2.p02_LoneSum;

public class LoneSum {
    public int loneSum(int a, int b, int c) {
        int output=0;
        if(a!=b && a!=c){
            output+=a;
        }
        if(b!=a && b!=c){
            output+=b;
        }
        if(c!=a && c!=b){
            output+=c;
        }
        return output;
    }
}
