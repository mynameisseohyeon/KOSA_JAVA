package org.example;

import java.util.Scanner;

public class method2 {

    /*

``  3) 매개변수 없고, 리턴 타입만 있는 경우
    public returnType methodName() {return value};

    4) 매개변수 있고, 리턴타입 있는 경우
    public returnType methodName(parameter var1, parameter var2) {};

    */


    // 3) 매개변수 없고, 리턴 타입만 있는 경우
    public static int show() {
        return 999;
    }

    public static String name() {
        String str = "lee";
        return str;
    }

    public static int max() {
        System.out.println("x, y = ");
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();
        int max = (x > y) ? x : y;
        return max;
    }

    // 4) 매개변수 있고, 리턴타입 있는 경우
    public static String name2(int x, String irum) {
        System.out.println("x = " + x);
        return irum;
    }

    public static double value(int x, int y) {
        return x + y; //int
    }

    public static double value2(int x, int y, double z) {
        return x + y + z; // int
    }

    public static String display(int x, String name) {
        value2(1, 2, 3.);

        for(int i = 0; i <= x; i++) {
            System.out.print(name + '\t');
        }
        System.out.println();
        return name + x; //  String으로 형 변환이 이루어짐
    }

    public static void main(String[] args) {
        // return 타입만 있는 경우 호출하는 입장에서 책임을 져야 함
//        System.out.println(show());
//        int num = show();
//        System.out.println(num);
//
//        System.out.println(name());
//        double num2 = show();
//        System.out.println(num2);
//
//        System.out.println(max());
//
//        System.out.println(name2(10, "lee"));

        System.out.println(value(1, 4));
        display(3, "java");
    }






}
