package com.design.pattern.AbstractFactory;

/**
 * @author qianji
 * @date 2020/1/2 23:37
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("Blue")) {
            return new Blue();
        } else if (colorType.equalsIgnoreCase("Green")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
