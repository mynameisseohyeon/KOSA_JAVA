package org.example;

import java.util.*;

public class ListEx {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println("length     /     capacity");
        System.out.println(v.size() + " / " + v.capacity());

        Vector<Integer> v2 = new Vector<>();
        System.out.println("length     /     capacity");
        System.out.println(v2.size() + " / " + v2.capacity());

        v2.add(22);
        v2.add(33);
        v2.add(12);
        v2.add(22);
        v2.add(88);
        v2.add(100);
        v2.add(300);
        v2.add(12);
        v2.add(20);
        v2.add(888);
        System.out.println(v2.size() + "       /       " + v2.capacity());
        System.out.println(v2);
        System.out.println(v2.size() + "개 요소 존재");

        System.out.println("-------- iterator() method --------");
        Iterator it = v2.iterator();
        while(it.hasNext()) { // 순서대로 요소 꺼낸 후 출력하기
            System.out.println(it.next());
        }

        System.out.println("-------- get() method --------");
        for(int i = 0; i < v2.size(); i++) {
            System.out.println(v2.get(i));
        }

        System.out.println("-------- sort() method --------");
        Collections.sort(v2); // 요소대로 순서 정렬
        for(int i = 0; i < v2.size(); i++) {
            System.out.println(v2.get(i));
        }

        // 뒤에 At이 붙어 있는 경우 복수를 의미
        System.out.println("-------- elementsAt() method --------");
        for(int i = 0; i < v2.size(); i++) { // vector 안에 있는 모든 요소에 대해 반복
            Integer num = v2.elementAt(i); // 요소 객체 알아내기
            System.out.println(v2.get(i));
        }

        System.out.println("-------- trimeToSize() method --------");
        System.out.println(v2.size() + "       /       " + v2.capacity()); // 요소가 추가될수록 차이가 발생
        v2.trimToSize();
        System.out.println(v2.size() + "       /       " + v2.capacity());

    }
}