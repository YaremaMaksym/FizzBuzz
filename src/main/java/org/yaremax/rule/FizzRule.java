package org.yaremax.rule;

public class FizzRule implements Rule {
    @Override
    public String apply(int n) {
        return (n % 3 == 0) ? "Fizz" : "";
    }
}
