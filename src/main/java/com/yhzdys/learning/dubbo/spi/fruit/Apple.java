package com.yhzdys.learning.dubbo.spi.fruit;


import org.apache.dubbo.common.URL;

public class Apple implements Fruit {
    private static final String _NAME = "Apple";

    @Override
    public void printName() {
        System.out.println(_NAME);
    }

    @Override
    public void printName(URL url) {
        this.printName();
    }
}
