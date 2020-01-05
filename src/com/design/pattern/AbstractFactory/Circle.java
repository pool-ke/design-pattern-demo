package com.design.pattern.AbstractFactory;

/**
 * @author qianji
 * @date 2020/1/2 23:11
 */
public class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method.");
    }
}
