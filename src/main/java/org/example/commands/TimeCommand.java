package org.example.commands;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeCommand implements Command {
    @Override
    public void getCommand() {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
