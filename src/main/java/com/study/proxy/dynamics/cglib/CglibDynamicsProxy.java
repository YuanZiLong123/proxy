package com.study.proxy.dynamics.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicsProxy implements MethodInterceptor {



    public Object getInstance(Class<?> clazz) throws  Exception{
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(clazz);
            enhancer.setCallback(this);
            return  enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
       // Object obj = methodProxy.invoke(o,objects);错误
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }

    private  void before(){
        System.out.println("我是代理人，你可以要我做任何事");

    }

    private void after(){
        System.out.println("我已经帮你做完了 ");
    }


}
