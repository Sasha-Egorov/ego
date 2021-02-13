package com.egorov.homeworks.homework10;


import java.io.FileWriter;
import java.io.IOException;


public class FileLogger extends Logger {

    public FileLogger(Level level, String message) {
        super(level, message);
    }

    @Override
    public void log(String message) {
        log(message, this.level);
    }

    @Override
    public void log(String message, Level level) {


        String result = createMessage(message, level);

        try (FileWriter writer = new FileWriter("file.txt", true)) {

            writer.write(result);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }


    }
}
