package org.example;

import java.util.*;

// 프로그래머스 - K번째 수
public class Algorithm {
    public int[] solution (int[] array, int[][] commands) {
        //배열 자르고 정렬했을 때, k번째에 있는 수 구하기
        int[] answer = new int[commands.length];

    for(int i = 0; i < commands.length; i++) {
            // 1- based index에서 0 - basded index로 변환
            int start = commands[i][0] -1; // i번에서 자를 시작 인덱스
            int end = commands[i][1]; // j번째에서 자를 끝 인덱스 (end인덱스까지 잘라내기 때문에 -1을 할 필요가 없음)
            int k = commands[i][2] - 1; // k번쨰 원소

            // array i번째부터 j번째까지 자르고 새로운 배열에 저장
            int[] temp = Arrays.copyOfRange(array, start, end);

            Arrays.sort(temp);

            answer[i] = temp[k];
        }
    }
}

