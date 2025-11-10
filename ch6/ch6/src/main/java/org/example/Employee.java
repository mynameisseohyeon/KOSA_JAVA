package org.example;

public class Employee {

    private int num; // 사번
    private String name; // 이름
    private String department; // 부서
    private String phoneNum; // 연락처

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Employee(int num, String name, String department, String phoneNum) {
        this.num = num;
        this.name = name;
        this.department = department;
        this.phoneNum = phoneNum;
    }
}
