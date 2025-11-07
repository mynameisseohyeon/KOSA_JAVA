package org.example;

import java.util.*;

public class ArrayEx2 {

    public static void main(String[] args) {

        // 2차원 배열

        int[][] a = new int[2][3]; //행, 열
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        System.out.println(a[0][0]);

        int[][] b = new int[][] { {1, 2, 3},  {4, 5, 6}};

        int[][] c = {{1, 2, 3},  {4, 5, 6}};

        for(int i = 0; i <b.length; i++) {
            for(int j = 0; j <b[i].length; j++) {
                System.out.println(b[i][j]);
            }
        }

        System.out.println("c[0][2] = " + c[0][2]);

        System.out.println("-----------------------");


    }
}
