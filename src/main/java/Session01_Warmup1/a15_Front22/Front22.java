package Session01_Warmup1.a15_Front22;

public class Front22 {
    public String front22(String str) {
        String front=(str.length()<2?str:str.substring(0,2));
        return front+str+front;
    }
}
