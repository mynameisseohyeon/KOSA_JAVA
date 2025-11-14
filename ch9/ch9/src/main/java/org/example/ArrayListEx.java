package org.example;

import java.util.*;



public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList list = new ArrayList<> (10);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(3);

        ArrayList list2 = new ArrayList <> (list.subList(1,4));
        System.out.println(list + " " + list2);
        list.add(33);

        Collections.sort(list);
        Collections.sort(list2);
        System.out.println(list + " " + list2);

        System.out.println("list.containsAll(list2) : " + list.containsAll(list2));

        for(int i = list2.size() -1 ; i >= 0; i--) {
            if (list.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        System.out.println(list + " " + list2);

    }

    public static void print(ArrayList list, ArrayList list2) {
        System.out.println("list : " + list);
        System.out.println("list2 : " + list2);
    }
}
