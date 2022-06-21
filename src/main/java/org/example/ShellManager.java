package org.example;

import org.example.commands.Command;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class ShellManager {
    @Autowired
    Command timeCommand, dateCommand, exitCommand;

    public void runCommand() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.next();
            switch (command) {
                case "date":
                    dateCommand.getCommand();
                    break;
                case "time":
                    timeCommand.getCommand();
                    break;
                case "exit":
                    exitCommand.getCommand();
                    break;
            }
        }
    }
}
