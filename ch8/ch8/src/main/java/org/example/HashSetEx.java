package org.example;

import java.util.*;

// Set : 순서 없고, 중복 허용하지 않음
public class HashSetEx {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("키보드");
        hs.add("마우스");
        hs.add("볼펜");
        hs.add("컵");
        hs.add("키보드");

        // 중복을 허용하지 않기 때문에 요소의 개수가 5개가 아닌 4개가 나온다
        System.out.println("요소 개수 : " + hs.size());
        System.out.println(hs); // 순서 x

        HashSet<Integer> hs2 = new HashSet<>();
        // hs2.add("12312"); // 정수형 타입으로 제한했으나 문자열을 넣었기 때문에 error 발생
        System.out.println(hs2);

        HashSet hs3 = new HashSet(); // 타입을 제한하지 않았을 경우
        hs3.add(12.34);
        hs3.add(300);
        hs3.add("string");
        System.out.println(hs3);

        Iterator it = hs3.iterator();
        while (it.hasNext()) { //  다음 요소가 있다면
            System.out.println(it.next()); // 요소를 꺼내와서 출력
        }

    }
}
