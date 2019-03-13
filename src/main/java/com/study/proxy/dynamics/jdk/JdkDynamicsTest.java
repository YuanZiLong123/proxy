package com.study.proxy.dynamics.jdk;

import com.study.proxy.Behavior;
import com.study.proxy.People;

import java.lang.reflect.Proxy;

public class JdkDynamicsTest {


    public static void main(String[] args) {
        People people = new People();
        JdkDynamicsProxy dynamicsProxy = new JdkDynamicsProxy();
        Behavior proxy =(Behavior) new  JdkDynamicsProxy().getInstance(people);
        proxy.wantToDo();
    }
}
