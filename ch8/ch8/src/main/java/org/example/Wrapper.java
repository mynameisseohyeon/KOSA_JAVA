package org.example;

import java.awt.*;

/*Wrapper class : 기본 자료형에 대응되는 클래스형 자료형
기본자료형		클래스형(레퍼런스 또는 참조형)자료형
int				Integer
float				Float
double			Double

char				Character  ....*/

public class Wrapper {

    public static void line() {
        System.out.println("===============");
    }

    public static void main(String[] args) {

//        Integer la =  new Integer(10); // heap memory에 저장
//        Integer lb =  new Integer("10");
        String su = "30";
        Point pt = new Point();

        System.out.println(pt);
        System.out.println(pt.toString());

//        System.out.println(la);
//        System.out.println(la.toString());
//        System.out.println(la.getClass().getName() + '@' + Integer.toHexString(la.hashCode())); // 16진수로 이루어진 주소 보는 방법

        line();
        int x = 77; // stack memory에 저장
        double y = 5.5;
        System.out.println(x + ", " + y);
        // y = x; // 묵시적 형 변환
        x = (int)y; // 명시적 형 변환
        System.out.println(x + ", " + y);

        // Boxing vs UnBoxing
//        int c = la.intValue(); // jdk 4.x 이전에 사용하더 ㄴ메소드
//        int d = lb; // jdk 5.x 이후부터 autoboxing, unboxing

        line();
        int num = Integer.parseInt(su);
        System.out.println(num);
        // System.out.println(c + num);

        // 클래스형 자료형
//        Double dd = new Double(12.34); // Double dd = 12.34
//        c = (int)dd.doubleValue(); //명시적으로 int를 작성해주어야 한다

        line();
        int e = Integer.parseInt("123");
        int f = Integer.parseInt("1111111", 2); // 2의 7승을 2진수 형태로 출력
        System.out.println(f);
        System.out.println(e + 20);


    }


}
