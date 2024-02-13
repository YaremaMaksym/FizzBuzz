package org.yaremax.sequence;

import java.util.List;
import java.util.stream.IntStream;

public class StandardSequenceGeneratorGenerator implements SequenceGenerator<Integer> {
    @Override
    public List<Integer> generate(Integer count) {
        return IntStream
                .rangeClosed(1, count)
                .boxed()
                .toList();
    }
}
