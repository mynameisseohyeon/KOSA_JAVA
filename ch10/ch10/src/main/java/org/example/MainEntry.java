package org.example;

import java.util.*;

class Point { int x, y; }

public class MainEntry {

    public static void main(String[] args) {
        GenericEx<String> t1 = new GenericEx<String> ();

        String[] str = {"abc", "kbs", "dictor"};
        t1.set(str);
        t1.print();

        GenericEx<Integer> t2 = new GenericEx<>();
        Integer[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        t2.set(num);
        t2.print();

        GenericEx<Object> t3 = new GenericEx<Object>(); // 여러 타입을 다 포함하고 싶은 경우 Object
        Object[] obj = {12.34, new Date(), 42.7, "hello"};
        t3.print(obj);
    }
}
