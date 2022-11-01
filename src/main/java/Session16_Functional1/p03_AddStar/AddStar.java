package Session16_Functional1.p03_AddStar;

import java.util.List;

public class AddStar {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(s->s+"*");
        return strings;
    }
}
