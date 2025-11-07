package org.example;



public class returnEx {
    // return 유무 차이
    public static void returnEx2() {
        int x = 5;
        System.out.println(x);
        x *= 100;


        if(x == 500) return; // 제어권을 넘김 => 아래는 출력하지 않음

        System.out.println(x);
        System.out.println("여기까지 출력해줘~~");
    }

    public static void main(String[] args) {
        returnEx2();

        if(args.length < 0) { // 데이터가 하나라도 들어오지 않았다면
            System.out.println("using error");
            return; // 제어권을 넘김
        }

        // [Run] → [Edit Configurations...] -> 실행 중인 클래스 이름 -> Program arguments 에 입력
        // 3 5 hello world
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);

        String s1 = args[0];
        String s2 = args[1];

        int su1 = Integer.parseInt(s1);
        int su2 = Integer.parseInt(s2);

        System.out.println(su1 + su2);
    }




}
