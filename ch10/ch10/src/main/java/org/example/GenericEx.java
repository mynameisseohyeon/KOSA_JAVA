package org.example;

public class GenericEx<T> { // 쓰는 순간에 타입을 정하는 템플릿 타입 => 타입의 유연성 확보

    T[] v; // 멤버 변수

    public void set( T[] v) { // 멤버 함수
        this.v = v;
    }

    public void print() {
        for(T item : v) {
            System.out.println(item);
        }
        System.out.println("=============");
    }

    // Object 배열을 처리하는 print() 메서드를 오버로드
    public void print(Object[] obj) {
        for (Object item : obj) {
            System.out.println(item);
        }
        System.out.println("=============");
    }




}
