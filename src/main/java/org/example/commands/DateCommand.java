package org.example.commands;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateCommand implements Command {
    @Override
    public void getCommand() {
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}
