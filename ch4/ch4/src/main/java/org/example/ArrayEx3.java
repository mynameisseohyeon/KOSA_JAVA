package org.example;

import java.util.*;

public class ArrayEx3 {

    public static void main(String[] args) {
        // 3차원 배열

        int[][][] a = new int[2][3][4]; // 2면 3행 4열

        System.out.println(a.length); // 면 크기
        System.out.println(a[0].length); // 행 크기
        System.out.println(a[1].length); // 행 크기

        System.out.println(a[0][0].length); // 열 크기
        System.out.println(a[0][1].length); // 열 크기

        System.out.println("------------------");

        // 임의적인 데이터 입력 받아서 입력된 데이터 값 출력하는 프로그램 작성 (3차원 배열)
        // input
        for (int i = 0; i < a.length; i++) { // 면
            for (int j = 0; j < a[i].length; j++) { // 행
                for (int k = 0; k < a[i][j].length; k++) { // 열
                    a[i][j][k] = new Random().nextInt(100);
                }
            }
        }

        // output
        for (int i = 0; i < a.length; i++) { // 면
            for (int j = 0; j < a[i].length; j++) { // 행
                for (int k = 0; k < a[i][j].length; k++) { // 열
                    System.out.println(a[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
