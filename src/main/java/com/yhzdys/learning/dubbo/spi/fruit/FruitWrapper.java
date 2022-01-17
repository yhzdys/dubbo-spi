package com.yhzdys.learning.dubbo.spi.fruit;

import org.apache.dubbo.common.URL;

public class FruitWrapper implements Fruit {

    private final Fruit fruit;

    public FruitWrapper(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void printName() {
        System.out.println("@@@@@@@@@@");
    }

    @Override
    public void printName(URL url) {
        this.fruit.printName();
    }

}
