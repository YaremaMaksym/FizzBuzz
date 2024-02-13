package org.yaremax;

import org.yaremax.executor.Executor;
import org.yaremax.executor.StandardRuleExecutor;
import org.yaremax.output.ConsoleOutputHandler;
import org.yaremax.output.OutputHandler;
import org.yaremax.rule.*;
import org.yaremax.sequence.SequenceGenerator;
import org.yaremax.sequence.StandardSequenceGeneratorGenerator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int n = 20;
        List<Rule> rules = List.of(
                new FizzBuzzRule(),
//                new FizzOrBuzzRule(),
                new FizzRule(),
                new BuzzRule()
        );

        SequenceGenerator<Integer> sequenceGenerator = new StandardSequenceGeneratorGenerator();
        List<Integer> numbers = sequenceGenerator.generate(n);
        Executor standardRuleExecutor = new StandardRuleExecutor(rules);
        OutputHandler outputHandler = new ConsoleOutputHandler();

        List<String> outputs = standardRuleExecutor.execute(numbers);

        outputHandler.handleOutput(outputs);
    }

}