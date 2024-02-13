package org.yaremax;

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
        FizzBuzzExecutor fizzBuzzExecutor = new FizzBuzzExecutor();
        OutputHandler outputHandler = new ConsoleOutputHandler();

//        Input
        List<Integer> numbers = sequenceGenerator.generate(20);
        List<Rule> rules = List.of(
                new FizzRule(),
                new BuzzRule()
        );

        List<String> outputs = fizzBuzzExecutor.execute(numbers, rules);

        outputHandler.handleOutput(outputs);
    }

}