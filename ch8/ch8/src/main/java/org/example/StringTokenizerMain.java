package org.example;

import java.util.StringTokenizer;

public class StringTokenizerMain {

    public static void main(String[] args) {
        // StringTokenizer token = new StringTokenizer("김연아 박태환 손연재 두효정 조재표");
        StringTokenizer token = new StringTokenizer("김연아/박태환/손연재/두효정/조재표", "/");

        while(token.hasMoreTokens()){ // 다음 토큰 값이 있다면 true return
            System.out.println(token.nextToken()); // 스페이스를 구분자로 인식
        }

        // split() 메소드 이용해서 출력하기
        System.out.println("--------split() 메소드 이용 1 ------------");
        String str = "김연아 /박태환 손연재 /두효정 /조재표";

        String[] result = str.split("/"); // split이 반환하는 값은 배열
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].trim()); // 앞뒤 공백 제거 후 출력
        }

        // split() 메소드 "|"와 "&" 기준으로 문자열 나누기
        System.out.println("--------split() 메소드 이용 2 ------------");
        String str2 = "김연아 /박태환 |손연재 /두효정 &조재표";
        String[] result2 = str2.split("[|&]"); // 2가지를 기준으로 구분을 하고자 할 때 []안에 작성
        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i].trim()); // 앞뒤 공백 제거 후 출력
        }

        String[] result3 = "김연아 /박태환 |손연재 /두효정 &조재표".split("[|&]");

    }
}
