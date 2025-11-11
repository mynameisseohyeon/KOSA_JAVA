package org.example;

public class Subway extends Trans{

    @Override
    public void start(String arrival) {
        System.out.println("이번 정차역은 " + arrival + "입니다.");
    }

    @Override
    public void stop(String departure) {
        System.out.println("다음 정차역은 " + departure + "입니다.");
    }

    @Override
    public void name(String name) {
        System.out.println("지하철 " + name);
    }
}
