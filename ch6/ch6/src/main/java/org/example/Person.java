package org.example;

public class Person { // 주민번호 검진키

    private String name, phone;
    private int age;

    // 멤버 함수, 출력 함수
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println(name + ", " + phone + ", " + age);
    }
}
