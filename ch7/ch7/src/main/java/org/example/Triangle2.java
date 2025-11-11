package org.example;

public class Triangle2 extends Shape2 {

    int w = 5, h = 7;

    @Override
    public double calc() {
        result = (w * h) / 2;
        return result;
    }

    @Override
    public void draw() {
        calc();
        System.out.println("삼각형의 넓이 : " + result + "인 삼각형을 그렸습니다.");
    }


}
