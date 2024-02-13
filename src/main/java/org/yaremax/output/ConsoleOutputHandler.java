package org.yaremax.output;

import java.util.List;

public class ConsoleOutputHandler implements OutputHandler {
    @Override
    public void handleOutput(List<String> outputs) {
        outputs.forEach(System.out::println);
    }
}
