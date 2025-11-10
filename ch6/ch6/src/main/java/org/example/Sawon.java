package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Sawon {
    private int num; //사번ß
    private String name; // 이름
    private String position; // 직급
    private String department; // 부서
    private int pay; // 급여
    private String phoneNum; //연락처

    // 인스턴스 클래스 초기화
    // @AllArgsConstructor로 자동 생성 가능
    public Sawon(int num, String name, String position, String department, int pay, String phoneNum) {
        this.num = num;
        this.name = name;
        this.position = position;
        this.department = department;
        this.pay = pay;
        this.phoneNum = phoneNum;
    }
}