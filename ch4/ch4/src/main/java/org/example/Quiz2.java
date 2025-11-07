package org.example;

import java.util.*;

public class Quiz2 {

    public static void main(String[] args) {
        // 배열 여러 개 데이터 중에서 7의 개수 찾기

//        int[] a = new int[]{7, 3, 7, 8, 1, 9, 7, 100, 12, 7, 33, 7};
//        int seek = 7, count = 0, sum = 0;
//
//        System.out.println("array size = ");
//        int SU =
//
//
//        if (a[i] == seek) {
//            count++;
//            sum += a[i];
//        }
//        System.out.println("7의 개수 = " + count + "sum = ");

    // 2차원 배열에 임의적인 숫자 입력 받아서 합을 출력해주시오

        int[][] d = new int[2][3];

//        Random random = new Random();

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        int x = 1;

//        for(int i = 0; i < d.length; i++) {
//            for(int j = 0; j <d[i].length; j++) {
//                System.out.println(d[i][j]);
//            }
//        }

        // 0과 1행의 합을 2행에 표시하시오
        int[][] arr = new int[][] {{3, 10, 2, 8}, {7, 15, 5, 3}, {0, 0, 0, 0}};
        int sum1 = 0;
        // int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                sum1 = arr[i][i];
            }
        }
    }
}
