package org.example;

public class StringMethod {
    public static void main(String[] args) {

        String s1 = "happy ";
        String s2 = "lunch time!!";

        System.out.println(s1 + s2);
        System.out.println(s2.replace("l", "L"));

        String s3 = " h      i     ";
        System.out.println(s3);
        System.out.println(s3.length()); // 14
        s3 = s3.trim(); // 공백 제거 함수
        System.out.println(s3.length()); //8

        String s4 = new String("aid oawif 324 dsfj as234");
        String[] s5 = s4.split(" ");
        for(int i = 0; i < s5.length; i++){
            System.out.println("분리된 " + i + "번 문자열 : " + s5[i]);
        }

        String s6 = "010-1234-5678";
        String[] s7 = s6.split("-");
        for (int i = 0; i < s7.length; i++) {
            System.out.println(s7[i]);
        }

        String s8 = "123525367578fgjw 15346 dsifw ef 2536468";
        char ch = s8.charAt(3); // 특정 위치에 있는 문자 반환
        System.out.println(ch);

        s8 = s8.substring(5, 7);
        System.out.println(s8);

        System.out.println(s2);
        System.out.println(s2.toUpperCase());

        char[] ch2 = s1.toCharArray();
        for(int i = 0; i < ch2.length; i++){
            System.out.println(ch2[i] + "\t");
        }
    }
}
