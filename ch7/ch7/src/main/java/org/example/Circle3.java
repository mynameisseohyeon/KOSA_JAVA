package org.example;

public class Circle3 extends Shape3 {

    @Override
    public double calc() {
        return 0;
    }

    @Override
    public void draw() {

    }

    @Override
    public double calc(double x) {
        result = x * x * Math.PI;
        return result;
    }

    @Override
    public void show(String name) {
        calc(5.5);
        System.out.println(result + "크기의 " + name +  "이 그린 원을 만들었습니다");
    }
}
