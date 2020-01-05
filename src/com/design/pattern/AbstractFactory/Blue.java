package com.design.pattern.AbstractFactory;

/**
 * @author qianji
 * @date 2020/1/2 23:30
 */
public class Blue implements Color{
    @Override
    public void fill(){
        System.out.println("Inside Blue::draw() method.");
    }
}
