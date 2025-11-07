package org.example;

import java.sql.SQLOutput;

public class method { // 시작점 (진입점)

    /*
    1) 매개변수 없고, 리턴타입 없는 경우
    public returnType methodName() { }

    2) 매개변수 있고, 리턴타입 없는 경우
    public returnType methodName(parameter var1, parameter var2, ...) { }
     */

    public static void main(String[] args) {
        info(); // 함수 호출
        line();
        plus(3, 5);
        name("홍길동");
    }

    // 1) 매개변수 없고, 리턴타입 없는 경우
    public static void info() { // 함수 정의부
        System.out.println("kim");
        System.out.println("010-0000-0000");
        System.out.println("seoul");
    }

    public static void line(){
        System.out.println("------------");
    }

    // 2) 매개변수 있고, 리턴타입 없는 경우
    public static void plus(int x, int y) {
        System.out.println(x+y);
    }

    public static void name(String name) {
        System.out.println(name + "님 반갑습니다");
    }





}
