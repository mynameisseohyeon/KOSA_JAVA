package org.example;


interface A { // 객체가 아니기 때문에 해당하는 인터페이스 예시로 new A 와 같은 객체 생성은 불가능
    int x = 90; // interface - abstract method, final field 만 갖는다
    final int y = 777;

    // 추상메소드 abstract 생략 가능함 - 무조건 추상메소드임
    public void show();
    public abstract void disp();
    // public void view() {} // error
}

interface B {
    void view();
}

interface C {
    String name = "happy";
    public void draw();
}

interface D extends B {
    void dview();
}

// 나를 상속받아서 만드는 클래스와 같은 경우 객체 생성 가능
class Rect implements D {
    @Override
    public void view() { // B

    }

    @Override
    public void dview() { // D

    }
}

public class InterfaceEx {

//     > interface
//            - 클래스 아님.(객체 생성 안됨)
//            - implements
//            - 추상메소드, 상수만 가질 수 있다. ( abstract, final 생략 가능 )
//            - 다중 상속 구현,...

    public static void main(String[] args) {
        int a = 8;
    }
}
