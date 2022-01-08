package com.yhzdys.learning.jdk.spi;

import java.util.ServiceLoader;

public class JdkSpiMain {

    public static void main(String[] args) {
        ServiceLoader<Command> commandServiceLoader = ServiceLoader.load(Command.class);
        for (Command command : commandServiceLoader) {
            command.execute();
        }
    }
}
