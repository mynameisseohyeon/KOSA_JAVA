package org.example;

import java.util.*;

// 프로그래머스 - 나누어 떨어지는 숫자 배열
// 나누어 떨어지는 값을 오름차순으로 정렬한 배열 반환
class Algorithm {
    public int[] solution(int[] arr, int divisor) {

        int[] answer = new int[arr.length];
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            // divisor로 나누어떨어지면 answer에 저장
            if (arr[i] % divisor == 0) {
                answer[count] = arr[i];
                count++;
            }
        }

        if (count == 0) { // 나누어떨어지는 수가 하나도 없을 경우 -1반환
            return new int[] {-1};
        }

        // 오름차순 정렬
        answer = Arrays.copyOf(answer, count); // 0이 섞이지 않도록 크기 조정
        Arrays.sort(answer);

        return answer;
    }
}
