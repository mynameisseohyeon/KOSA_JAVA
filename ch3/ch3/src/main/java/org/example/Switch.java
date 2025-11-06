package org.example;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        System.out.println("point = ?(1, 2, 3)");
        int point = new Scanner(System.in).nextInt();

        switch (point) { // long형을 제외한 정수형, 문자형 올 수 있다. 실수x
            case 1 : {
                System.out.println("포인트 점수 1점 입니다.");
                break;
            }
        }
    }
}
