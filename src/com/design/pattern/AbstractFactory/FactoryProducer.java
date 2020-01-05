package com.design.pattern.AbstractFactory;

/**
 * @author qianji
 * @date 2020/1/2 23:46
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        if (factoryType.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if (factoryType.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
