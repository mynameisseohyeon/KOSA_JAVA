package org.example;

import java.util.*;

public class CalendarEx {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("==================");
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1 + "월"); // 월은 0부터 시작
        System.out.println(c.get(Calendar.DATE) + "일");

        Date date = new Date();
        int h = date.getHours();
        int m = date.getMinutes();
        int s = date.getSeconds();
        System.out.println("현재 시간은 " + h + ":" + m + ":" + s);
    }

}
