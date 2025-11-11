package org.example;

public class AbstractEx2 {
    // 추상클래스를 만드는 2가지 방법
    public static void main(String[] args) {
        // 2.

        //Shape sh = new Shape(); // 자체적으로 객체 생성 불가능
        Shape2 c = new Circle2(); // 부모를 통한 객체 생성
        Shape2 t = new Triangle2();
//        Circle c = new Circle(); // 자신으로 객체 생성
        c.draw();
        t.draw();

    }
}
