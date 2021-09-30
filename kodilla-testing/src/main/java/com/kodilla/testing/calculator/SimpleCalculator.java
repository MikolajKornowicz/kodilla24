package com.kodilla.testing.calculator;

public class SimpleCalculator {

    private int a;
    private int b;
    private int addresult;
    private int subresult;

    public SimpleCalculator (int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add () {
        this.addresult = addresult;
        addresult = a + b;
        return addresult;
    }
    public int subtract (){
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
