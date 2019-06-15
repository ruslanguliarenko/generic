package com.company;

public class C extends B implements iMarker {
    private int c;

    public C(){

    }

    public C(int b, int a, int c) {
        super(b, a);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }




}
