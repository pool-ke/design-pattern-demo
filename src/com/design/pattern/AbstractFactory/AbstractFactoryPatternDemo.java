package com.design.pattern.AbstractFactory;

/**
 * @author qianji
 * @date 2020/1/2 23:51
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape1 = shapeFactory.getShape("RecTangle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUare");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("Circle");
        shape3.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("red");
        color1.fill();
        Color color2 = colorFactory.getColor("green");
        color2.fill();
        Color color3 = colorFactory.getColor("blue");
        color3.fill();
    }


}
