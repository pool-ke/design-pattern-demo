package com.design.pattern.factory;

/**
 * @author qianji
 * @date 2020/1/2 23:12
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType == "Rectangle") {
            return new Rectangle();
        } else if (shapeType == "Circle") {
            return new Circle();
        } else if (shapeType == "Square") {
            return new Square();
        }
        return null;

    }
}
