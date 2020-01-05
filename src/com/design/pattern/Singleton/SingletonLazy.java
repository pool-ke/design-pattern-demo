package com.design.pattern.Singleton;


/**
 * @author qianji
 * @date 2020/1/3 0:26
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

    /**
     * threadSafe
     */
//    public static synchronized SingletonLazy getInstance(){
//        if (instance == null){
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }
}
