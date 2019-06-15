package com.company;


import java.util.Objects;

public class A implements iMarker{
    private int a;

    public A() {

    }

    public A(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }
}
