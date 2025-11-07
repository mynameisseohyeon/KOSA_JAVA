package org.example;

import java.util.*;

// 프로그래머스 추억함수
// https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class Algorithm {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // photo 배열 길이에 맞춰 sumArr 생성
        int[] sumArr = new int[photo.length];

        // photo 배열 중 그리운 사람이 포함되어 있는 경우 그리움 점수 합계를 구함
        for(int i = 0; i < photo.length ; i++) {
            int sum = 0; // photo[i]마다 초기화

            for(int j = 0; j < photo[i].length ; j++) { // 사진 속 이름 반복
                for (int n = 0; n < name.length; n++) { // 이름 및 배열 비교
                    if (name[n].equals(photo[i][j])) { // 일치 하는 경우 점수 누적
                        sum += yearning[n];
                    }
                }
            }
            sumArr[i] = sum; // yearing 합계 sumArr에 배열로 저장
        }

        return sumArr;
    }
}
