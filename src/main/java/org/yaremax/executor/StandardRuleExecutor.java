package org.yaremax.executor;

import org.yaremax.rule.Rule;

import java.util.List;

public class StandardRuleExecutor implements Executor<List<Integer>> {
    private final List<Rule> rules;

    public StandardRuleExecutor(List<Rule> rules) {
        this.rules = rules;
    }

    public List<String> execute(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> {
                    String output = "";

                    for (Rule rule : rules) {
                        output = rule.apply(number);
                        if (!output.isEmpty()) break;
                    }

                    return output.isEmpty() ? String.valueOf(number) : output;
                }
        ).toList();
    }
}
