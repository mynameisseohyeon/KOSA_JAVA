package org.example;

import java.util.Random;

public class MathEx {

    public static void main(String[] args) {
        System.out.println(Math.random()); // 8byte형 데이터 (double 타입)
        System.out.println((int)(Math.random() * 100)); // 십의 자리까지 출력
        System.out.println((int)(Math.random() * 100) + 1); //1 ~ 100 중 랜덤 숫자 출력

        System.out.println("--------------------");

        Random rand = new  Random(); // 객체 생성 new를 사용하는 순간 heap 영역에 들어가게 된다
        // 시스템 언어는 각 영역의 int형 크기를 갖는다 java는 4바이트
        // 객체 생성 => 메모리 할당

        System.out.println(rand.nextInt());
        System.out.println(rand.nextDouble());

        System.out.println("--------------------");

        int num = rand.nextInt();
        System.out.println(num); // 0 ~ n-1 값 추출
        System.out.println(rand.nextInt(5) + 1); // 1~ 5

    }
}
