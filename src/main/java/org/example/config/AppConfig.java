package org.example.config;

import org.example.ShellManager;
import org.example.commands.DateCommand;
import org.example.commands.ExitCommand;
import org.example.commands.TimeCommand;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DateCommand dateCommand() {
        return new DateCommand();
    }

    @Bean
    public TimeCommand timeCommand() {
        return new TimeCommand();
    }

    @Bean
    public ExitCommand exitCommand() {
        return new ExitCommand();
    }

    @Bean
    public ShellManager developer() {
        return new ShellManager();
    }
}
