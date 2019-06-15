package com.company;

import java.util.Objects;

public class B  extends A implements iMarker {
    private int b;

    public B() {

    }

    public B(int b, int a) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                '}';
    }
}
