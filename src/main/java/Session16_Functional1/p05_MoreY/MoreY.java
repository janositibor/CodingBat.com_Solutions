package Session16_Functional1.p05_MoreY;

import java.util.List;

public class MoreY {
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s->"y"+s+"y");
        return strings;
    }
}
