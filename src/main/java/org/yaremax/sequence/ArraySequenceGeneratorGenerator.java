package org.yaremax.sequence;

import java.util.List;

public class ArraySequenceGeneratorGenerator implements SequenceGenerator<List<Integer>> {
    @Override
    public List<Integer> generate(List<Integer> arr) {
        return arr;
    }
}
