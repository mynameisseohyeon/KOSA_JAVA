package org.example;

import lombok.*;
import java.util.*;

/*    문제] Customer class
    no, name, address, tel  field
    생성자함수, setter/getter method

    ArrayList or Vector 이용해서
    고객추가 / 삭제 / 고객 리스트 출력 / 수정 / 프로그램 종료  메뉴를 구성해서 출력하는 프로그램 작성하세요.*/

@Getter
@Setter
class Customer2{
    int no;
    String name;
    String address;
    String tel;

    public Customer2() {
        this.no = no;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}

public class Quiz {

    public static void main(String[] args) {

        Customer2 customer2 = new Customer2();
        ArrayList<Customer2> customerList = new ArrayList <> ();
        customerList.add(customer2);

        customer2.setNo(1);
        customer2.setName("홍길동");
        customer2.setAddress("서울특별시 하늘빛구 구름동 123-45 무지개아파트 7층 701호\n");
        customer2.setTel("010-0000-0000");

        System.out.println("No1 고객 정보 출력 : " + customerList);

        customerList.get(0).setName("");// no1의 고객 이름 삭제
        System.out.println("No1 고객 이름 데이터 삭제 : " + customerList);
    }
}
