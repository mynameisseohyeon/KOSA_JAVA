package org.example;

public class Plain extends Trans{

    @Override
    public void start(String arrival) {
        System.out.println("지금부터 출발지 " + arrival + "에서");
    }

    @Override
    public void stop(String departure) {
        System.out.println("목적지 " + departure + "로 향하는 비행기 출발 방송을 시작하도록 하겠습니다.");
    }

    @Override
    public void name(String name) {
        System.out.println(name + " 비행기를 이용해 주셔서 감사합니다");
    }
}
