package com.design.pattern.Singleton;

/**
 * @author qianji
 * @date 2020/1/3 0:17
 */
public class SingletonPatternDemo {
    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }

}
