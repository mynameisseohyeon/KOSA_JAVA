package org.example;

class Point {}

public class PointEx {
    public static void main(String[] args) {
        Point pt = new Point(); // 객체 생성, 메모리에 할당, 생성자함수 자동호출
        System.out.println("Point pt infomation");
        System.out.println("class name : " + pt.getClass());
        System.out.println("hash code : " + pt); // 16진수로 출력
        System.out.println("hash code : " + pt.hashCode()); // 10진수로 출력
        System.out.println("Object String : " + pt);
        System.out.println("Object String : " + pt.toString());

        System.out.printf("10진수 주소 %d\n", 0x14ae5a5); // 0x를 붙이면 16진수 표시 / 10진수와 같은 주소를 가졌는지 16진수를 10진수로 변경하며 확인해보기

        System.out.println("==========================");
        Point pt2 = new Point();
        System.out.println("Point pt2 infomation");
        System.out.println("class name : " + pt2.getClass());
        System.out.println("hash code : " + pt2);
        System.out.println("hash code : " + pt2.hashCode());
        System.out.println("Object String : " + pt2);
        System.out.println("Object String : " + pt2.toString()); // org.example.Point@28a418fc
        System.out.println("############################");

        System.out.println("pt2.toString() : toString()의 의미");
        System.out.println(pt2.getClass().getName()+'@'+pt2.hashCode());
        System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt2.hashCode())); // toString을 쓴 것과 동일
        System.out.println("############################");

        Point pt3 = new Point();

        if( pt.hashCode() == pt3.hashCode() ) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }

        Point pt4;
        pt4 = pt;
        if( pt.hashCode() == pt4.hashCode() ) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
    }
}
