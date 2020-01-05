package com.design.pattern.AbstractFactory;

/**
 * @author qianji
 * @date 2020/1/2 23:09
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
