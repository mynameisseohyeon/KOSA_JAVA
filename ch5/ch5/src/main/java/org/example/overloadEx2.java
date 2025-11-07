package org.example;

public class overloadEx2 {

    // 가변 길이 함수 (전제 조건 => 매개변수의 자료형이 같은 타입이어야 한다)
    public static void plus(int...x) { // 가변 길이 함수 ...
        //int[] a = new int[30]; // 고정길이 배열
        int sum = 0;
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i] + "");
        }
        System.out.println();
    }

    public static void plus(String...x) {
        String sum = "";
        for(int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        plus(1, 2, 3);
        plus(1, 2, 3, 4, 5, 6);
        plus("kbs", "abc");
    }
}
