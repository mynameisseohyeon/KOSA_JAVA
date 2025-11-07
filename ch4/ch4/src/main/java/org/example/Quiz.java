package org.example;

import java.util.*;

public class Quiz {

    public static void main(String[] args) {

        // 임의의 데이터 5개를 입력받아서 출력하는 프로그램 작성
        Scanner sc = new Scanner(System.in);

        int y = 0;
        int[] a = new int[10];

        // input
        for(int i = 1; i < 4; i++) {
            y = sc.nextInt();
        }

        // output
        for(int i = 1; i < 4; i++) {
            System.out.println(y);
        }

        System.out.println("array a = ");
        for(int i = 1; i < a.length; i++) {
            a[i] = sc.nextInt();
            a[i] = (int)Math.round(10) + 1;
        }


    }
}
