package org.example;

import java.util.*;

public class VectorEx {
    public static void main(String[] args) {
        int x;
        Date date = new Date();
        Vector v = new Vector(3, 5);

        v.addElement("자바");
        v.addElement(new double[(int) 10.2]);
        v.addElement(date);

        System.out.println(" ----------- 3개 객체 추가 -------------");
        System.out.println("size : " + v.size() + ", capacity : " + v.capacity());

        for ( int i = 0; i < 10; i++ ) {
            v.addElement(new int[i]);
            // v.addElements(i);

        }

        System.out.println(" ----------- 10개 객체 추가 -------------");
        System.out.println("size : " + v.size() + ", capacity : " + v.capacity());

        System.out.println(" ----------- Vector 내용 출력 -------------");
        Enumeration enu = v.elements();
        while(enu.hasMoreElements()) {
            System.out.println(enu.nextElement() + " ");
        }

        System.out.println(" ----------- 객체 내용 포함 확인 -------------");
        if(v.contains("자바")) System.out.println("자바 문자열 포함 되어 있음");
        else System.out.println("자바 미포함");

        System.out.println("10.2 객체 위치? " + v.indexOf(v.indexOf(10.2)));
        System.out.println("입력 시간 : " + date );
        System.out.println();
        System.out.println(v.indexOf(date));
        System.out.println(v.get(2));

        System.out.println("***************");
        // date object delete
        v.removeElementAt(v.indexOf(date));
        // 데이터 개수가 줄어들면 올바르게 실행된 것
        System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
        System.out.println(v);

        System.out.println("***************");
        for(int i = 0; i < v.size(); i++) { // for문을 돌면서 데이터 안의 모든 요소가 지워졌을 거라 생각하지만
            // v.removeElementAt(i);
            v.remove(i); // 인덱스 번호를 통해 지우기 (결과는 위와 동일)
            // v.remove(0); // 해당 요소 이름 데이터 삭제
            // v.remove("자바");
            // v.removeAllElements(); // 모든 데이터 다 지우기
        }

        System.out.println("***************");
        // 실제로 출력해보면 그렇지 않다
        // 삭제 후 뒤에 있던 값의 index가 앞으로 이동하기 때문에 남아있던 요소들이 삭제되지 않고 살아남게 된다
        System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
        System.out.println(v);

        // 중간에 요소 추가하기
        System.out.println("***************");
        v.setElementAt("java", 2);

        enu = v.elements();
        while(enu.hasMoreElements()) {

            System.out.println(enu.nextElement() + " ");
        }

        System.out.println("***************");
        // size는 6인데 capacity는 13이라 낭비
        v.trimToSize();
        System.out.println("size : " + v.size() + ", capacity : " + v.capacity());

        System.out.println("***************");
        v.setSize(2); // 강제로 크기를 2로 조정 => 강제로 사이즈를 조절하게 되면 데이터가 없어진다
        enu = v.elements();
        while(enu.hasMoreElements()) {
            System.out.println(enu.nextElement() + " ");
        }
        System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
    }

}
