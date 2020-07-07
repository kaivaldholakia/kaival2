package com.example.demo.spring_1.model;

public class mymodel {

    String name;

    int number;

    public mymodel() {
    }

    public mymodel(String a, int b) {
        this.name = a;
        this.number = b;
    }

    public String getA() {
        return name;
    }

    public void setA(String a) {
        this.name = a;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "mymodel{" +
                "a='" + name + '\'' +
                ", b=" + number +
                '}';
    }
}
