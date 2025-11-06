package org.example;

import java.util.Scanner;

public class Quiz {

    /*
 문제] 이름 입력 받고, 국어,영어,전산 점수 입력 받아서
      총점, 평균까지 구하는 프로그램 작성

      이도연님의 성적표**************
      국어 : 100, 영어 : 100, 전산 : 100
      총점 : 300, 평균 : 100.0
*/
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        char name = input.next().charAt(0);
//        int score1 = input.nextInt();
//        int score2 = input.nextInt();
//        int score3 = input.nextInt();
//
//        int total = score1 + score2 + score3;
//        double avg =  (score1 + score2 + score3)/3;
//
//        System.out.println(name + "님의 성적표**************");
//        System.out.println("국어 : " + score1 + ", 영어 : " + score2 + ", 전산 : " + score3);
//        System.out.println("총점 : " + total + ", 평균 : " + avg);
//    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);


        // 1. 원하는 단 입력 받아서 구구단 출력하기
//        System.out.println("구구단 몇 단을 출력할까요?");
//
//        int dan =  sc.nextInt();
//        for (int i = 1; i < 10; i++) {
//            System.out.println(dan + " x " + i + " = " + dan * i );
//        }


        //2. 구구단 전체 출력하는 프로그램 작성
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + i*j);
//            }
//        }


        // 3.과제3]
        //1.    2.   3.   4.
        //*   *****       *   *****
        //**   ****      **    ****
        //***   ***     ***     ***
        //****   **    ****      **
        //*****   *   *****       *
        //

        //1
//        for (int i = 1; i <= 5; i++){
//            System.out.println("*".repeat(i));
//        }

        //2
//        int j = 0;
//        for (int i = 5; i > 0; i--){
//            System.out.println(" ".repeat(j) + "*".repeat(i));
//            j += 1;
//        }

        //3
//        int j = 4;
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(" ".repeat(j) + "*".repeat(i));
//            j -= 1;
//        }





        //5.      6.
        //    *       *********
        //   ***        *******
        //  *****         *****
        // *******             ***
        //*********                *
        //
        //   7.
        //       *
        //      ***
        //     *****
        //    *******
        //   *********
        //    *******
        //     *****
        //      ***
        //       *
        //           8.
        //       *
        //      * *
        //     *   *
        //    *      *
        //   *        *
        //    *      *
        //     *   *
        //      * *
        //       *




    }


}
