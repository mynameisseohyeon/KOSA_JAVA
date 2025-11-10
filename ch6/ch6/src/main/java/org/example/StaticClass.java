package org.example;

class A {
    int x, y;

    public static void setData(int xx, int yy) {
        System.out.println(xx + ", " + yy);
    }

}

public class StaticClass {

    public static void main(String[] args) {

        A a = new A(); // 객체 생성, 메모리 할당, 생성ㅅ자 함수 자동호출

        a.setData(20, 30); // object.methodName();
        A.setData(100, 500); // ClassName.methodName();

        a.x = 999;
    }

}
