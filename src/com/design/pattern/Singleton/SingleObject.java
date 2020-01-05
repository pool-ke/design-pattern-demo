package com.design.pattern.Singleton;

/**
 * @author qianji
 * @date 2020/1/3 0:14
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }
}
