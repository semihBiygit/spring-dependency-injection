package com.semih;

public class B {
    A a;

    public B() {
        a = new A();
    }
    public String getMessage(){
        return a.getMessage();
    }
}
