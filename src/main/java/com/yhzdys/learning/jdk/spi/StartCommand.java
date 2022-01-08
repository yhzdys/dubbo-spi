package com.yhzdys.learning.jdk.spi;

public class StartCommand implements Command {
    @Override
    public void execute() {
        System.out.println("start ...");
    }
}
