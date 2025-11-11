package org.example;

public class AbstractEx3 {

    public static void main(String[] args) {

        // 1. 각자의 클래스로 객체 생성한 형태
        Circle3 c = new Circle3();
        c.show("Circle3");

        new Triangle3().show("사각형");

        System.out.println(" ****************");

        // 2. Shape3 부모 추상 클래스를 이용해서 객체 생성
        Shape3 sh3 = new Circle3();
        sh3.show("원");

        sh3 = new Triangle3();
        sh3.show("Triangle3");

        System.out.println(" ****************");

        // 3. 배열을 이용한 형태
        Shape3[] s = new Shape3[3];

        //Shape3 ss = new Shape(); // 자체적으로 객체 생성 불가능 => 배열은 생성 가능
        s[0] = new Circle3();
        s[1] = new Triangle3();

        String[] names = {"Circle3", "Triangle3"};

        for (int i = 0; i < names.length; i++) {
            s[i].show(names[i]);
        }

        System.out.println(" ****************");

    }
}
