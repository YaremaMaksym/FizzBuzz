package org.yaremax.executor;

import java.util.List;

public interface Executor<T> {
    public List<String> execute(T t);
}
