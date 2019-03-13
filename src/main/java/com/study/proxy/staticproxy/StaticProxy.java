package com.study.proxy.staticproxy;

import com.study.proxy.Behavior;
import com.study.proxy.People;

public class StaticProxy implements Behavior {

    private People people;

    public StaticProxy(People people) {
        this.people = people;
    }

    private  void before(){
        System.out.println("我是代理人，你可以要我做任何事");

    }

    private void after(){
        System.out.println("我已经帮你做完了 ");
    }

    @Override
    public void wantToDo() {
        before();
        people.wantToDo();
        after();
    }



}
