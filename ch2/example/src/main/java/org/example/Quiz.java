package org.example;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) { // 결과 : 만원 56장, 천원 7장, 백원 8개, 십원 9개

        // 좋은 알고리즘 풀이 방법

        //1. 변수 선언
        //2. 메세지 출력 및 입력받기
        //3. 처리 (계산)
        //4. 결과 출력 (화면)

//        int pay = 567890; // 나눗셈과 나머지 연산자를 이용해서 결과를 생성하시오
//        int a, b, c, d = 0;
//
//        a = pay / 10000;
//        b = (pay % 10000) / 1000;
//        c = (pay % 1000) / 100;
//        d = (pay % 100) / 10;
//
//        System.out.println("만원 " + a + "장, \n천원 " + b + "장, \n백원 " + c + "개, \n십원 " + d + "개");
//
//        System.out.println("--------------------");


        // 짝수, 홀수 구분
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if(num % 2 == 0) { //짝수일 경우
//            System.out.println("짝수");
//        } else if(num % 2 == 1) {
//            System.out.println("홀수");
//        }
//
//        System.out.println("--------------------");

        // 윤년/평년 판정 프로그램
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//
//        if(year % 4 ==0) {
//            if(year % 100 != 0 || year % 400 == 0){
//                System.out.println("윤년");
//            }
//        } else {
//            System.out.println("평년");
//        }


        // 평균 60점, 과락 40점 불합격 아니면 합격
//        System.out.println("첫 번째 과목 점수를 입력하시오 : ");
//        Scanner sc1 = new Scanner(System.in);
//
//        System.out.println("두 번째 과목 점수를 입력하시오 : ");
//        Scanner sc2 = new Scanner(System.in);
//
//        System.out.println("세 번째 과목 점수를 입력하시오 : ");
//        Scanner sc3 = new Scanner(System.in);
//
//        System.out.println("네 번째 과목 점수를 입력하시오 : ");
//        Scanner sc4 = new Scanner(System.in);

        // Scanner 객체를 한 번만 생성하여 모든 입력을 처리합니다.
//        Scanner sc = new Scanner(System.in);

//        // ==> 개선 :  점수 입력을 출력과 동시에 받기
//        System.out.print("첫 번째 과목 점수를 입력하시오: ");
//        int num1 = sc.nextInt();
//
//        System.out.print("두 번째 과목 점수를 입력하시오: ");
//        int num2 = sc.nextInt();
//
//        System.out.print("세 번째 과목 점수를 입력하시오: ");
//        int num3 = sc.nextInt();
//
//        System.out.print("네 번째 과목 점수를 입력하시오: ");
//        int num4 = sc.nextInt();


//
//        int num1 = sc1.nextInt();
//        int num2 = sc2.nextInt();
//        int num3 = sc3.nextInt();
//        int num4 = sc4.nextInt();
//        int avg = (num1 + num2 + num3 + num4) / 4;
//
//        if(avg >= 60) {
//            System.out.println("합격");
//        } else if (num1 < 40 || num2 < 40 || num3 < 40 || num4 < 40) {
//            System.out.println("과락");
//        } else if (avg < 60) {
//            System.out.println("불합격");
//        }


        // 큰 순으로 숫자 출력
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        int num3 = sc3.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println( num1 + "" +  num2 + "" + num3);
            } else if (num3 > num2) {
                System.out.println( num1 + "" +  num3 + "" + num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println( num2 + "" +  num1 + "" + num3);
            } else if (num3 > num1) {
                System.out.println( num2 + "" +  num3 + "" + num1);
            }
        } else if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                System.out.println( num3 + "" +  num1 + "" + num2);
            } else if (num2 > num1) {
                System.out.println( num3 + "" +  num2 + "" + num1);
            }
        }
    }
}
