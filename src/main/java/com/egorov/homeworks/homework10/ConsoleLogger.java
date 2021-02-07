package com.egorov.homeworks.homework10;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(Level level, String message) {
        super(level, message);
    }

    @Override
    public void log(String message) {
        log(message, this.level);
    }


    @Override

    public void log(String message, Level level) {

        System.out.print(createMessage(message, level));

    }
}
