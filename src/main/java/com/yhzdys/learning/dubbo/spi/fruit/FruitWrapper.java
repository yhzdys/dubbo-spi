package com.yhzdys.learning.dubbo.spi.fruit;

import com.alibaba.dubbo.common.URL;

public class FruitWrapper implements Fruit {

    private final Fruit fruit;

    public FruitWrapper(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String getName() {
        System.out.println("@@@@@@@@@@");
        return this.fruit.getName();
    }

    @Override
    public String getName(URL url) {
        return this.fruit.getName();
    }

}
