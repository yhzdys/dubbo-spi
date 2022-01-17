package com.yhzdys.learning.dubbo.spi.fruit;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("apple")
public interface Fruit {

    void printName();

    @Adaptive
    void printName(URL url);
}
