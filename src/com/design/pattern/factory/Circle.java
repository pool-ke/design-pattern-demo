package com.design.pattern.factory;

/**
 * @author qianji
 * @date 2020/1/2 23:11
 */
public class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}
