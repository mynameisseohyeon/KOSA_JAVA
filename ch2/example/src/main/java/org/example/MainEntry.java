package org.example;

public class MainEntry {
    public static void main(String[] args) {
        // shift 연산자 : <<, >>, <<<

        int x = 8, result;

        result = x << 2; // left shift 원래값 * 2^bit 수 ==> 8 * 4 = 32
        System.out.println("left shift : " + result);

        result = 0; //초기화
        result = x >> 3; // right shift : 원래값 / 2^bit 수 ==> 8 / 2^3 = 1
        System.out.println("right shift : " + result);

        System.out.println("--------------------");

        // 논리 연산자
        //&, |, ^ (2진 논리 결과를 값으로)
        // &&, ||, ! (10진 논리 결과를 참, 거짓으로)

        int a = 4, b = 7, c = 5;
        System.out.println(a + ", " + b);
        System.out.println("a & b = " + (a & b)); //4
        System.out.println("a | b = " + (a | b)); //7
        System.out.println("a ^ b = " + (a ^ b)); //3

        System.out.println("--------------------");

        boolean flag;
        flag = a > b && c > b;
        System.out.println("a > b && c > b = " + flag);



        // 삼항 연산자
        int e, f, g, h;
        e = f = g = h = 10;
        int su = 3;

    }
}
