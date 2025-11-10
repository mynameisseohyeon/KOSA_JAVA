package org.example;

class Point {
    int x, y; // 멤버 변수 - 접근지정자 : private < default < protected < public

    // 멤버 함수
    public void setData(int xx, int yy) {

    }
    public int getX() { return x; }
    public void setX(int xx) { x = xx;}

    public int getY() { return y; }
    public void setY(int yy) { y = yy; }

    public void display() {
        System.out.println(getX() + ", " + getY());
        System.out.println(x + ", " + y); // 출력 시 위 코드와 동일
    }
}


class Circle {
    private int x, y, r;

    // Command + N (getter, setter 메서드 설정 단축키)

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void display() {
        System.out.println(x + ", " + y + ", " + "r");
    }
}


public class PointEx { // extends Objects

    public static void printLine() {
    System.out.println("----------");
    };

    public static void main(String[] args) {
        Point pt = new Point(); // 객체생성, 메모리 할당, 생성자 함수 자동 호출

        printLine();

        System.out.println(pt.x  + ", " + pt.y );
        pt.setData(1, 2);
        pt.display();

        printLine();

        Circle c = new Circle();
        c.setR(5);
        c.setX(100);
        c.setY(100);
        c.display();

        printLine();

        Rectangle r = new Rectangle();
        r.setX(10);
        r.setY(20);
        r.setX2(30);
        r.setY2(40);
        r.display();


    }
}
