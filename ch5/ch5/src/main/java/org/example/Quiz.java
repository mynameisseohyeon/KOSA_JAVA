package org.example;

import java.util.*;

public class Quiz {

    /*
     add (x, y)
     sub (x, y) // return 타입이 없도록 만들기
     mul() return type => *
     div // 인자가 있어도 되고, 없어도 되는데 return타입 존재 // 나눌 때 0은 나눌 수 없으니 예외처리 필요
    */
    Scanner sc = new Scanner(System.in);

    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    public static void sub(int x, int y) {
        System.out.println(x - y);
    }

    public static int mul(int x, int y) {
        try{
            return x * y;
        } catch (Exception e) { // 입력 값에 0이 있을 경우
            System.out.println("0을 입력하지 말아주세요");
            return 0;
        }
    }

    public static int div(int x, int y) {
        try{
            System.out.println("x, y = ");
            x = new Scanner(System.in).nextInt();
            y = new Scanner(System.in).nextInt();
            System.out.println("x / y = " + x/y);
        } catch (Exception e) { // 입력 값에 0이 있을 경우
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        add(3, 5);
        sub(5, 2);
        System.out.println(mul(4, 0));

    }
}
