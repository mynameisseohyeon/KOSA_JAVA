package org.example;

public class SawonMain{

    public static void main(String[] args) {
        Sawon sawon = new Sawon(124, "lee", "과장", "인사부", 3000000, "010-0000-0000");

        System.out.println("사번: " + sawon.getNum());
        System.out.println("이름: " + sawon.getName());
        System.out.println("직급: " + sawon.getPosition());
        System.out.println("부서: " + sawon.getDepartment());
        System.out.println("급여: " + sawon.getPay());
        System.out.println("연락처: " + sawon.getPhoneNum());
    }
}
