package com.design.pattern.AbstractFactory;

/**
 * @author qianji
 * @date 2020/1/2 23:27
 */
public class Red implements Color {
    @Override
    public void fill(){
        System.out.println("Inside Red::draw() method.");
    }
}
