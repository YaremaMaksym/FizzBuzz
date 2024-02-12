package org.yaremax;

import org.yaremax.rule.BuzzRule;
import org.yaremax.rule.FizzRule;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static FizzRule fizzRule = new FizzRule();
    static BuzzRule buzzRule = new BuzzRule();

    public static void main(String[] args) {
        System.out.println(func(20));
    }

    public static List<String> func(int n) {
        List<String> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.delete(0, sb.length());

            sb.append(fizzRule.doRule(i));
            sb.append(buzzRule.doRule(i));

            if (sb.isEmpty()) sb.append(i);

            arr.add(sb.toString());
        }
        return arr;
    }
}