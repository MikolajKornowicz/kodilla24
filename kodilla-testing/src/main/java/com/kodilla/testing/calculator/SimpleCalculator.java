package com.kodilla.testing.calculator;

public class SimpleCalculator {

    private int a;
    private int b;
    private int addresult;
    private int subresult;

    public SimpleCalculator () {
    }
    public int add (int a, int b) {
        this.addresult = addresult;
        this.a = a;
        this.b =b;
        addresult = a + b;
        return addresult;
    }
    public int subtract (int a, int b){
        this.a = a;
        this.b = b;
        this.subresult = subresult;
        subresult = a - b;
        return subresult;
    }

    public int getAddresult() {
        return addresult;
    }

    public int getSubresult() {
        return subresult;
    }
}
