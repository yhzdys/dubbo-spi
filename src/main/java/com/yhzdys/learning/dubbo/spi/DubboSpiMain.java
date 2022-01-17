package com.yhzdys.learning.dubbo.spi;

import com.yhzdys.learning.dubbo.spi.fruit.Fruit;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

public class DubboSpiMain {

    public static void main(String[] args) {
        ExtensionLoader<Fruit> FruitExtensionLoader = ExtensionLoader.getExtensionLoader(Fruit.class);

        // 默认扩展对象，由@SPI注解声明
//        Fruit fruit1 = FruitExtensionLoader.getDefaultExtension();
//        fruit1.printName();
//        System.out.println("==============================");
//
//        Fruit fruit2 = FruitExtensionLoader.getExtension("banana");
//        fruit2.printName();
//        System.out.println("==============================");

        Map<String, String> parameters = new HashMap<>(2);
        parameters.put("name", "orange");
        URL url = new URL("", "", 0, parameters);

        Fruit fruit3 = FruitExtensionLoader.getAdaptiveExtension();
        fruit3.printName(url);
        System.out.println("==============================");

//        parameters.put("fruit", "fruit.wrapper");
//        Fruit fruit4 = FruitExtensionLoader.getAdaptiveExtension();
//        fruit4.getName(url);
//        System.out.println("==============================");
    }

}
