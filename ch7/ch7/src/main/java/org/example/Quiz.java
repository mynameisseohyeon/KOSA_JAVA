package org.example;

public class Quiz {

//    문제1] Trans 추상클래스 <--- 부모는 모든 자손에게 상속할 수 있는 최소한의것
//    추상메소드 start() / stop()
//
//    public String name(String name) {
//        return name;
//    }
//
//    sub class : Subway / Bus / Biclycle / Plain
//
//    MainEntry 에서 메인 함수 구현하기

    public static void main(String[] args) {


        Subway subway = new Subway();
        subway.name("안내방송");

        subway.start("가락시장역");
        subway.stop("경찰 병원역");

        System.out.println("*********************");

        Plain plain = new Plain();
        plain.name("대한항공");
        plain.start("대한항공 인천국제공항");
        plain.stop("싱가포르 창이 국제 공항");

    }

}
