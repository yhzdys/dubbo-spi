package com.yhzdys.learning.dubbo.spi.fruit;

import org.apache.dubbo.common.URL;

public class Orange implements Fruit {
    private static final String _NAME = "Orange";

    @Override
    public void printName() {
        System.out.println(_NAME);
    }

    @Override
    public void printName(URL url) {
        this.printName();
    }
}
