package Session07_String2.p17_OneTwo;

public class OneTwo {
    public String oneTwo(String str) {
        StringBuilder output=new StringBuilder();
        int length=str.length();
        int index=0;
        while(length-index>2){
            output.append(reorder3(str.substring(index,index+3)));
            index+=3;
        }
//        output.append(str.substring(index));
        return output.toString();
    }
    private String reorder3(String str){
        return str.substring(1)+str.substring(0,1);
    }
}
