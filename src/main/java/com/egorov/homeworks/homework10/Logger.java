package com.egorov.homeworks.homework10;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Logger {
    Level level;
    String message;

    public Logger(Level level, String message) {
        this.level = level;
        this.message = message;
    }

    public String createMessage(String message, Level level) {

        String result = "" + LocalDate.now() + " " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond();
        result = result + " " + level.name() + ": " + message + "\n";
        return result;
    }

    public abstract void log(String message) ;

    public abstract void log(String message, Level level);

}
