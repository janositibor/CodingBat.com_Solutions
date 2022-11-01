package Session17_Functional2.p07_NoYY;

import java.util.List;

public class NoYY {
    public List<String> noYY(List<String> strings) {
        strings.replaceAll(s->s+"y");
        strings.removeIf(s->s.contains("yy"));
        return strings;
    }
}
