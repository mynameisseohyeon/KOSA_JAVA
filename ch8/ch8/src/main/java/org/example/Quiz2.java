package org.example;

import java.util.*;

// TreeSet을 이용한 로또 프로그램 만들기
public class Quiz2 {

    public static void main(String[] args) {
        TreeSet<Integer> lotto = new TreeSet<> ();

        Random random = new Random();

        int num;
        int count = 0;

        while (count < 6) { // 6개의 숫자 추첨
            num = random.nextInt(45) + 1; // 1 ~ 45까지의 숫자 중 랜덤
            if (lotto.isEmpty()) {
                lotto.add(num);
                count++;
            } else if(!lotto.contains(num)) { // 중복 숫자 허용 방지
                lotto.add(num);
                count++;
            }
        }
        System.out.println("이번 회차 로또 당첨 번호 : " + lotto);
    }
}
