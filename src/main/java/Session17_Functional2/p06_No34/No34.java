package Session17_Functional2.p06_No34;

import java.util.List;

public class No34 {
    public List<String> no34(List<String> strings) {
        strings.removeIf(s->(s.length()==3 || s.length()==4));
        return strings;
    }
}
