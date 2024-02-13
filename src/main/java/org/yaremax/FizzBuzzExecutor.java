package org.yaremax;

import org.yaremax.rule.Rule;

import java.util.List;

public class FizzBuzzExecutor {
    public List<String> execute(List<Integer> numbers, List<Rule> rules) {
        return numbers.stream()
                .map(number -> {
                    StringBuilder output = new StringBuilder();

                    for (Rule rule : rules) {
                        output.append(rule.apply(number));
                    }

                    return output.isEmpty() ? String.valueOf(number) : output.toString();
                }
        ).toList();
    }
}
