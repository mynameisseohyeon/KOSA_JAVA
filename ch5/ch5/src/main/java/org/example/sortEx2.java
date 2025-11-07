package org.example;

import java.util.*;

public class sortEx2 {

    // SelectSort

    public static void main(String[] args) {
        int[] a = {7, 3, 5, 2, 8};
        int temp;

        System.out.println("sort 전 출력");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                //나보다 작은 숫자가 있으면 숫자 위치를 바꿈 (교환 알고리즘)
                if (a[i] > a[j]) { //교환
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }

        System.out.println("\n\nsort 후 출력");
        System.out.println(Arrays.toString(a));
    }
}