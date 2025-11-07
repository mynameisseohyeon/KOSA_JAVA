package org.example;

import java.util.Arrays;

public class bubbleSort { // 버블정렬

    public static void main(String[] args) {
        int[] a = { 7, 3, 5, 2, 8};
        int temp;

        System.out.println("sort 전 출력");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + "\t");
        }

        // sort
        System.out.println("\n\nsort 후 출력");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - i - 1; j++){ // i - 1 만큼 회전 진행
                if(a[j] > a[j + 1]) {// j와 j 뒤에 있는 숫자 비교 진행
                    // 앞에 있는 값이 더 클 경우 자리 교환
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                System.out.println(Arrays.toString(a));
            }
        }


    }
}
