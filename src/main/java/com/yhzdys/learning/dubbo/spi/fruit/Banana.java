package com.yhzdys.learning.dubbo.spi.fruit;

import com.alibaba.dubbo.common.URL;

public class Banana implements Fruit {
    private static final String _NAME = "Banana";

    @Override
    public String getName() {
        System.out.println(_NAME);
        return _NAME;
    }

    @Override
    public String getName(URL url) {
        return this.getName();
    }
}
