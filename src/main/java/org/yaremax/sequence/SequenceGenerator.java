package org.yaremax.sequence;

import java.util.List;

public interface SequenceGenerator<T> {
    List<Integer> generate(T input);
}
