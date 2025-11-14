package org.example;

class Rect{
    int x, y;

    public void disp() { // 출력 함수 따로 생성
        this.x = x;
        this.y = y;
    }

    public Rect() { // 생성자
        super();
        x = y = 100;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Rectangle {

    public static void main(String[] args) {
        Rect r = new Rect();
        r.disp();

        System.out.println(r);
    }

}
