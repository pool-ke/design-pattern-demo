package com.design.pattern.AbstractFactory;

/**
 * @author qianji
 * @date 2020/1/2 23:33
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);
}
