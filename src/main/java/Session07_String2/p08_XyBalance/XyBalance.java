package Session07_String2.p08_XyBalance;

public class XyBalance {
    public boolean xyBalance(String str) {
        return str.lastIndexOf('x')<=str.lastIndexOf('y');
    }
}
