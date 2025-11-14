package org.example;

class A { int a; }

class B extends A { int b; }

public class InstanceOfEx {
    public static void main(String[] args) {
        A a = new A();
        // B aa = new A(); //B는 A의 자식이기 떄문에 새로운 객체 생성은 불가능
        B b = new B();
        A bb = new B();

        System.out.println("a instance A : " + (a instanceof A)); // a는 A의 자식이 맞는지 검사하는 instanceod
        System.out.println("b instance A : " + (b instanceof A)); //
        System.out.println("a instance B : " + (a instanceof B)); //
        System.out.println("b instance B : " + (b instanceof B)); //

    }

}
