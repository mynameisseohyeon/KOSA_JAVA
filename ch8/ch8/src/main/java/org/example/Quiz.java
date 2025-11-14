package org.example;

import java.util.*;

public class Quiz {

    public static void main(String[] args) {

        // 문제 1 ) String str = "ashfijeiwIEFJIEsjdfEOJF";
        // 위의 str 문자열을 대문자는 소문자로, 소문자는 대문자로 출력하는 프로그램 작성
        String str = "ashfijeiwIEFJIEsjdfEOJF";
        String[] strArr = new String[str.length()];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) { // 소문자일 경우
                strArr[i] = Character.toString(Character.toUpperCase(ch)); // 대문자 변경
            } else if (Character.isUpperCase(ch)) { // 대문자일 경우
                strArr[i] = Character.toString(Character.toLowerCase(ch)); // 소문자 변경
            }
        }
        System.out.println("문제 1) " + str + " 해당 문장에서 대문자는 소문자로, 소문자는 대문자로 출력 : " + strArr);


        // 문제 2 ) 임의의 문자열을 받아서 대문자 -> 소문자로, 소문자 -> 대문자로 출력하는 프로그램 작성
        System.out.print("임의의 영어 대소문자를 섞은 문자열을 입력해주세요 : \t");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strArr2 = new String[input.length()];
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isLowerCase(ch)) { // 소문자일 경우
                strArr2[i] = Character.toString(Character.toUpperCase(ch)); // 대문자 변경
            } else if (Character.isUpperCase(ch)) { // 대문자일 경우
                strArr2[i] = Character.toString(Character.toLowerCase(ch)); // 소문자 변경
            } else { // 숫자일 경우
                strArr2[i] = Character.toString(ch);
            }
        }
        System.out.println("문제 2 ) 임의의 문자열을 받아서 대문자 -> 소문자로, 소문자 -> 대문자로 출력 : " + String.join("", strArr2));


        // 문제 3 ) str = "sgoje 218340 dsj BB HFEFPisdf" 소문자, 대문자, 숫자 개수 구하기
        String str3 = "sgoje 218340 dsj BB HFEFPisdf";
        int lowerCount = 0;
        int upperCount = 0;
        int numCount = 0;

        for(int i = 0; i < str3.length(); i++){
            char ch = str3.charAt(i);
            if(Character.isLowerCase(ch)) { // 소문자일 경우
                lowerCount++;
            } else if(Character.isUpperCase(ch)) { // 대문자일 경우
                upperCount++;
            } else if(Character.isDigit(ch)) { // 숫자일 경우
                numCount++;
            }
        }

        System.out.println("문제 3 ) str3의 소문자의 개수 : " + lowerCount + "\t 대문자의 개수 : " + upperCount + "\t 숫자의 개수 : " + numCount);
        sc.close();
    }
}
