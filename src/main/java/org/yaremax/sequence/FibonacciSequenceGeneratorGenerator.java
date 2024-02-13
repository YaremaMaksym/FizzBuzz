package org.yaremax.sequence;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequenceGeneratorGenerator implements SequenceGenerator<Integer> {
    @Override
    public List<Integer> generate(Integer count) {
        List<Integer> sequence = new ArrayList<>();
        int a = 0;
        int b = 1;

        for (int i = 0; i < count; i++) {
            sequence.add(a);
            int next = a + b;
            a = b;
            b = next;
        }

        return sequence;
    }
}
