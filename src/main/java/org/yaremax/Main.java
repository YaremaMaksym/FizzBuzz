package org.yaremax;

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

        List<Integer> numbers = sequenceGenerator.generate(20);
        List<Rule> rules = List.of(
                new FizzRule(),
                new BuzzRule()
        );

        System.out.println(fizzBuzzExecutor.execute(numbers, rules));
    }

}