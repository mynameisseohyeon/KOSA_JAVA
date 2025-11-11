package org.example;

abstract class Shape { // abstract class, Super class(부모)
    double result = 0;

    public abstract double calc(); // 추상 메소드
    public abstract void draw();

    public void show() {
        System.out.println("Super class Shape call ~~~");
    }
}

// 추상클래스는 반드시 @Override를 이용하여 정의를 내려주어야 한다

class Circle extends Shape { // Sub class

    double r = 5.0;

    @Override
    public double calc() {
        result = r * r * Math.PI;
        return result;
    }

    @Override
    public void draw() {
        calc();
        System.out.println("원의 넓이 : " + result + "인 원을 그렸습니다.");
    }
}

class Rectangle extends Shape {

    int w = 3;
    int h = 5;

    @Override
    public double calc() {
        result = w * h;
        return result;
    }

    @Override
    public void draw() {
        calc();
        System.out.println("사각형의 넓이 : " + result + "인 사각형을 그렸습니다.");
    }



}


public class Abstract {
    // 추상클래스를 만드는 2가지 방법
    public static void main(String[] args) {

        // 1. 미완성 클래스 -> 자체적으로 객체 생성 불가능
        // => 상속 받은 자손 클래스로 객체 생성

        //Shape sh = new Shape(); // 자체적으로 객체 생성 불가능
        Shape c = new Circle(); // 부모를 통한 객체 생성
        Shape r = new Rectangle();
//        Circle c = new Circle(); // 자신으로 객체 생성
        c.draw();
        c.show(); // super class

        r.draw();
        r.show();

        c = new Rectangle();
        c.draw();
    }
}
