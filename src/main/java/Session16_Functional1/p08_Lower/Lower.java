package Session16_Functional1.p08_Lower;

import java.util.List;

public class Lower {
    public List<String> lower(List<String> strings) {
        strings.replaceAll(s->s.toLowerCase());
        return strings;
    }
}
