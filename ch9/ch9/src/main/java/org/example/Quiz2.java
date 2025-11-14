package org.example;

import java.util.*;
/*
문제] Video class
no  비디오번호
title 비디오제목
category  장르
lend   대여여부
lendName  대여자(고객명)
lendDate   대여일자(오늘날짜 입력하심 되요)

Video 추가 / 삭제 / Video 리스트 출력 / 수정 / 프로그램 종료  출력하는 프로그램 작성하기.
*/

public class Quiz2 {

    static HashMap Video = new HashMap();
    Date today = new Date(); // 오늘 날짜 출력

    public static void main(String[] args) {
        Video(1, "전우치", "액션", 1, "홍길동", today);

    }

    public static void Video(int no, String title, String category, boolean lend, String lendName, String lendDate) {


    }
}
