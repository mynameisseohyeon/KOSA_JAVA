package org.example;

import java.util.*;

public class Quiz5 {

    public static void main(String[] args) {
        // 1차원, 2차원 배열 이용한 성적 처리 프로그램 작성 (3명)

        /*
        문제 ) 이름을 입력 받고, 국어, 영어, 전산 점수 입력 받아서
        총점, 평균, 학점(if, switch)까지 구하는 프로그램 작성
        국어, 영어, 전산 점수는 0 ~ 100 사이의 값만 입력 받게끔 처리

        출력 )
        이도연님의 성적표************
        국어 : 100, 영어 : 100, 전산 : 100
        총점 : 300, 평균 : 100.0
         */

        Scanner sc = new Scanner(System.in);
        String[][] scoreArr = new String[3][4]; // 이름, 과목 별 점수

        int sum = 0; // 총점
        int avg = 0; // 평균
        String result = "";

        // input
        for (int i = 0; i < 3; i++) {
            System.out.println("이름을 입력해주세요 : ");
            scoreArr[i][0] = sc.nextLine(); // 입력받은 이름 값 name에 저장
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        System.out.println("국어 점수를 입력하세요 : ");
                        scoreArr[i][j + 1] = sc.nextLine(); // i행 0열에는 이름이 존재하기 때문에 +1 진행
                        break;
                    case 1:
                        System.out.println("영어 점수를 입력하세요 : ");
                        scoreArr[i][j + 1] = sc.nextLine();
                        break;
                    case 2 :
                        System.out.println("전산 점수를 입력하세요 : ");
                        scoreArr[i][j + 1] = sc.nextLine();
                        break;
                }
            }
            sum = Integer.parseInt(scoreArr[i][1]) + Integer.parseInt(scoreArr[i][2])  + Integer.parseInt(scoreArr[i][3]);
            avg = sum / 3;

            if(Integer.parseInt(scoreArr[i][1]) < 40 || Integer.parseInt(scoreArr[i][2]) < 40 || Integer.parseInt(scoreArr[i][3]) < 40) {
                result = "과락";
            } else if (avg >= 60) {
                result = "합격";
            } else {
                result = "불합격";
            }

            // output
            System.out.println(scoreArr[i][0] + "님의 성적표 ***********");
            System.out.println("국어 : " + scoreArr[i][1] + ", 영어 : " + scoreArr[i][2] + ", 전산 : " + scoreArr[i][3]);
            System.out.println("총점 : " + sum + ", 평균 : " + avg);
            System.out.println(scoreArr[i][0] + "님의 시험 결과는 " + result + "입니다");
            System.out.println("");

        }
    }
}
