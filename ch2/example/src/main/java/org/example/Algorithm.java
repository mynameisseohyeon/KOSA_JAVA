package org.example;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {

        // 1. 변수 선언
        String answer = ""; // 완주하지 못한 선수
        // 마라톤에 참여한 선수들의 이름이 담긴 배열 participant
        // 마라톤을 완주한 선수들의 이름이 담긴 배열 completion

        //2. 메세지 출력 및 입력받기


        //3. 처리 (계산)
        // 마라톤을 완주하지 못한 선수들 구하기 (participant - completion)
        Arrays.sort(participant); // 배열 정렬
        Arrays.sort(completion);

        System.out.println(Arrays.toString(participant));



        //4. 결과 출력 (화면)
        return answer;
    }
}

public class Algorithm {
    public static void main(String[] args) {
        // 메서드 호출
        Solution solution = new Solution();
    }
}


