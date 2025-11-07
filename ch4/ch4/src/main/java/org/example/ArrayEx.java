package org.example;

public class ArrayEx {

    public static void main(String[] args) {
        char[] ch2 = new char[4];

        // 배열 초기화
        ch2[0] = 'J';
        ch2[1] = 'A';
        ch2[2] = 'V';
        ch2[3] = 'A';

        char[] ch3 = {'J', 'A', 'V', 'A', 'k', 'b', 'm', 's', 'b', 's'};

        System.out.println("배열의 길이(크기 : " + ch2.length );
        System.out.println("배열의 길이(크기 : " + ch3.length );

        System.out.println("ch[2] = " + ch2[2]);
        System.out.println("-----------------------");

        for(int i = 0; i < 4; i++) {
            System.out.println("ch[" + i + "] = " + ch2[i]);
        }

        System.out.println("-----------------------");

        for(int i = 0; i < ch3.length ; i++) {
            System.out.println("ch3[" + i + "] = " + ch3[i]);
        }


        System.out.println("-----------------------");
        // 랜덤 30일 평균 강수량 구하기


    }
}
