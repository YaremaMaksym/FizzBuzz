package org.yaremax.output;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileOutputHandler implements OutputHandler {
    private final String filePath;

    public FileOutputHandler(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void handleOutput(List<String> outputs) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath))) {

            for (String output : outputs) {
                writer.write(output);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
