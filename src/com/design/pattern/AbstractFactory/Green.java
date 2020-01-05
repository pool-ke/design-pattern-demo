package com.design.pattern.AbstractFactory;

/**
 * @author qianji
 * @date 2020/1/2 23:30
 */
public class Green implements Color{
    @Override
    public void fill(){
        System.out.println("Inside Green::draw() method.");
    }
}
