package org.yaremax.rule;

public class FizzRule implements Rule {
    @Override
    public String doRule(int n) {
        return (n % 3 == 0) ? "Fizz" : "";
    }
}
