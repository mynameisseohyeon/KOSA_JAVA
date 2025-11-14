package org.example;

import java.awt.*;

public class StringEx {

    public static void main(String[] args) {
        int x = 99;
        String str = "abc";
        System.out.println("str" + str);

        Point pt = new Point();
        System.out.println("pt : " + pt); // 주소값 출력
        System.out.println("str : " + str); // 데이터 값 출력

        char data[] = {'a', 'b', 'c'};
        str = new String(data);
        System.out.println("str : " + str);

        String msg = "hello ";
        msg = msg.concat("kosa");
        System.out.println("msg : " + msg);

        String str2 = "abcdefg".substring(1, 4); // 시작위치, 어디까지 출력할지
        System.out.println("str2 : " + str2);
    }
}
