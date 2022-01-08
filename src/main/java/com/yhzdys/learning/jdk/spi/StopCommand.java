package com.yhzdys.learning.jdk.spi;

public class StopCommand implements Command {
    @Override
    public void execute() {
        System.out.println("stop ...");
    }
}
