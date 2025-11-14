package org.example;

import java.util.TreeSet;

public class TreeSetEx {

    // TreeSet 은 자동정렬 해준다
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        int[] score = {100, 50, 85, 95, 60, 35, 65, 45, 10, 65, 100};

        for (int i = 0; i < score.length; i++) {
            set.add(score[i]);
        }

        System.out.println(set);
        System.out.println("50보다 작은 값 : " + set.headSet(50));
        System.out.println("50보다 큰 값 : " + set.tailSet(50));
    }
}
