package org.yaremax.rule;

public class FizzOrBuzzRule implements Rule{
    @Override
    public String apply(int n) {
        return (n % 3 == 0 || n % 5 == 0) ? "FizzBuzz" : "";
    }
}
