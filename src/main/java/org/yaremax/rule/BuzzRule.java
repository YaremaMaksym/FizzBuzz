package org.yaremax.rule;

public class BuzzRule implements Rule {
    @Override
    public String apply(int n) {
        return (n % 5 == 0) ? "Buzz" : "";
    }
}
