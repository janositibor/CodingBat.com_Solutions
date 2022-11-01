package Session17_Functional2.p05_NoLong;

import java.util.List;

public class NoLong {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(s->s.length()>=4);
        return strings;
    }
}
