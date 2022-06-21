package org.example.commands;

public class ExitCommand implements Command {
    @Override
    public void getCommand() {
        System.exit(0);
    }
}
