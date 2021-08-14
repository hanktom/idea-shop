package com.tom;

public abstract class MyClass {
    public void calculate() {
        //
    }
    public abstract void print();

    public static void main(String[] args) {
        MyClass myClass = new MyClass() {
            @Override
            public void print() {
                System.out.println();
            }
        };
        myClass.calculate();
    }
}

class SubClass extends MyClass {

    @Override
    public void print() {

    }
}