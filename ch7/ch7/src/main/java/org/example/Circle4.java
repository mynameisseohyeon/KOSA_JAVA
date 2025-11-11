package org.example;

class Circle04 {
    int x = 5, y = 5;
}

public class Circle4 {

    public static void main(String[] args) {
        Circle04 c1 =new Circle04();
        Circle04 c2 =new Circle04();

        if( c1 == c2 ) System.out.println("same");
        else System.out.println("different");

        int x = 3, y = 3;
        System.out.println("기본 자료형 비교");
        if ( x == y ) System.out.println("same");
        else System.out.println("different");

        System.out.println("참조 자료형 비교"); // stack영역에는 주소값을 가진다
        String s1 = new String("korea");
        String s2 = new String("korea");

        String s3 = new String("Korea");
        String s4 = new String("korea");

        // 주소값이기 때문에 서로 비교했을 때 출력은 different를 하게 된다
        if( s1 == s2 ) System.out.println("same");
        else System.out.println("different");

        // 참조 자료형에서 값을 비교할 떄는 equals메소드를 사용한다
        System.out.println("******** equlas() method 비교 ********");
        if( s1.equals(s2) ) System.out.println("same"); // korea == korea 문자가 서로 같기 때문
        else System.out.println("different");


        // 하지만 Korea 와 korea를 비교했을 떄는 서로 ASCII코드값이 다르기 때문에 different 출력

        if( s3.equals(s4) ) System.out.println("same");
        else System.out.println("different");
        System.out.println("========== 대소문자 비교 하지 않는 equalsIgnoreCase 함수 사용 ============");
        if( s3.equalsIgnoreCase(s4) ) System.out.println("same"); // 대소문자를 구분하고 싶지 않은 경우 equalsIgnoreCase() 함수 사용
        else System.out.println("different");
    }
}
