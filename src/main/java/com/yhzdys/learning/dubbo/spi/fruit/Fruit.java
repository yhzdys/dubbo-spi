package com.yhzdys.learning.dubbo.spi.fruit;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("apple")
public interface Fruit {

    String getName();

    @Adaptive
    String getName(URL url);
}
