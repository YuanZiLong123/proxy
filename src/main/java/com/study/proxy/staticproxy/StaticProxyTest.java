package com.study.proxy.staticproxy;

import com.study.proxy.People;

public class StaticProxyTest {


    public static void main(String[] args) {
        People people = new People();

        StaticProxy staticProxy = new StaticProxy(people);

        staticProxy.wantToDo();

    }
}
