package org.example;

public abstract class Shape3 {

    protected double result = 0;

    public abstract double calc(); // 추상 메소드
    public abstract void draw();

    public void show() {
    }

    public abstract double calc(double x);

    public abstract void show(String name);
}
