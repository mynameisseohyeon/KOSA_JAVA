package org.example;

// overload 중복 함수
public class overloadEx {

    public static void plus(int x, int y) {
        System.out.println(x + y);
    }

    public static void plus(double x, int y) {
        System.out.println(x + y);
    }

    public static void plus(int x, int y, int z) {
        System.out.println(x + y + z);
    }


    public static void main(String[] args) {
        // 알아서 매개변수를 찾아서 간다
        plus(1, 2);
        plus(1.3, 1);
        plus(3, 6,2);
    }
}
