package org.yaremax.executor;

import org.yaremax.rule.Rule;

import java.util.List;

public class StandardRuleExecutor implements Executor {
    private final List<Rule> rules;

    public StandardRuleExecutor(List<Rule> rules) {
        this.rules = rules;
    }

    public List<String> execute(List<Integer> numbers) {
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