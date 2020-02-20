package com.company;

public class Box   <E extends   Number , T extends Number > implements Interface {
    E Number1;
    T Number2;

    public Box(E number1, T number2) {
        Number1 = number1;
        Number2 = number2;
    }

    public E getNumber1() {
        return Number1;
    }

    public T getNumber2() {
        return Number2;
    }



    @Override
    public void add(Object o) {

    }

    @Override
    public E play() {
        return null;
    }
}
