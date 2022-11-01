package Session16_Functional1.p09_NoX;

import java.util.List;

public class NoX {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(s->s.replaceAll("x",""));
        return strings;
    }
}
