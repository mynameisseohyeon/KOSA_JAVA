package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        for(int i = 65; i <= 90; i++) {
//            System.out.println((char)i + "₩t");
//        }

//        for(char i = 'a'; i <= 'z'; i++) {
//            System.out.println((char)i + "₩t");
//        }

        // 진법
//        int su = 10;
//        System.out.printf("10진수 %d\n", su); //10 출력
//        System.out.printf("8진수 %o\n", su); // 12 출력
//        System.out.printf("16진수 %x\n", su, su); // a 출력
        // 형 변환
        short sh = 3; // -32,768 ~ 32,767
        int num = 50000; // -21억 ~ 21억

        // 작은 자료형이 큰 자료형에 자동형변환(묵시적형변환) 된다
        num = sh; //int(4byte) = short(2byte)

        System.out.println(sh + ", " + num); // 에러가 발생하지 않는다 num의 바이트가 더 크기 때문

        // 큰 자료형을 작은 자료형에 넣으려면 반드시 명시적 형변환을 해야 한다
        //sh = num; => 에러 발생
        sh = (short)num; //명시적 형변환을 했기 때문에 에러가 발생하지 않는다
        System.out.println(sh + ", " + num);



    }
}