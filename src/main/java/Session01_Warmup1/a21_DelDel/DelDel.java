package Session01_Warmup1.a21_DelDel;

public class DelDel {
    public String delDel(String str) {
        return deletable(str)?delete(str):str;
    }
    private boolean deletable(String str){
        return str!=null && str.length()>=4 && "del".equals(str.substring(1,4));
    }
    private String delete(String str){
        return str.charAt(0)+str.substring(4,str.length());
    }
}
