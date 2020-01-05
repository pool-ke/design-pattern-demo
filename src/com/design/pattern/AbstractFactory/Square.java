package com.design.pattern.AbstractFactory;

/**
 * @author qianji
 * @date 2020/1/2 23:10
 */
public class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}
