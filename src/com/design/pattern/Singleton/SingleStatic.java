package com.design.pattern.Singleton;

/**
 * @author qianji
 * @date 2020/1/3 0:33
 */
public class SingleStatic {
    private static class SingleHolder{
        private static final SingleStatic INSTANCE = new SingleStatic();
    }
    private SingleStatic(){}
    public static final SingleStatic getInstance(){
        return SingleHolder.INSTANCE;
    }
}
