package org.yaremax;

import org.yaremax.executor.Executor;
import org.yaremax.executor.StandardRuleExecutor;
import org.yaremax.output.ConsoleOutputHandler;
import org.yaremax.output.OutputHandler;
import org.yaremax.rule.BuzzRule;
import org.yaremax.rule.FizzRule;
import org.yaremax.rule.Rule;
import org.yaremax.sequence.SequenceGenerator;
import org.yaremax.sequence.StandardSequenceGeneratorGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SequenceGenerator<Integer> sequenceGenerator = new StandardSequenceGeneratorGenerator();
        List<Integer> numbers = sequenceGenerator.generate(20);

        List<Rule> rules = List.of(
                new FizzRule(),
                new BuzzRule()
        );
        Executor standardRuleExecutor = new StandardRuleExecutor(rules);

        OutputHandler outputHandler = new ConsoleOutputHandler();

        List<String> outputs = standardRuleExecutor.execute(numbers);

        outputHandler.handleOutput(outputs);
    }

}