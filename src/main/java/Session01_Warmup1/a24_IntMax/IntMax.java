package Session01_Warmup1.a24_IntMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntMax {
    public int intMax(int a, int b, int c) {
        List<Integer> listOfNumbers= new ArrayList(Arrays.asList(a, b, c));
        return Collections.max(listOfNumbers);
    }
}
