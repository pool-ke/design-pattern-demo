package com.design.pattern.Singleton;

/**
 * @author qianji
 * @date 2020/1/3 0:30
 */
public class SingletonDoubleLocking {
    private static SingletonDoubleLocking instance;

    private SingletonDoubleLocking(){}

    public static SingletonDoubleLocking getInstance(){
        if (instance == null ){
            synchronized (SingletonDoubleLocking.class){
                if (instance == null){
                    instance = new SingletonDoubleLocking();
                }
            }
        }
        return instance;
    }
}
