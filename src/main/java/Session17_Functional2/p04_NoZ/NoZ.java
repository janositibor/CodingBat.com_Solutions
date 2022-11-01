package Session17_Functional2.p04_NoZ;

import java.util.List;

public class NoZ {
    public List<String> noZ(List<String> strings) {
        strings.removeIf(s->s.contains("z"));
        return strings;
    }
}
