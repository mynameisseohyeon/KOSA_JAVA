package org.example;

import java.util.*;

public class HashMapEx2 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer> ();
        map.put("감찬", 50);
        map.put("재용", 70);
        map.put("감찬", 100);
        map.put("순신", Integer.valueOf(80));
        map.put("용녀", Integer.valueOf(90));


        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("이름 : " + e.getKey() + "점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values();
        System.out.println(values);
        it  = values.iterator();

        int total = 0;
        while(it.hasNext()) {
            Integer num = (Integer)it.next();
            total += num.intValue();
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total / set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최하점수 : " + Collections.min(values));
    }
}
