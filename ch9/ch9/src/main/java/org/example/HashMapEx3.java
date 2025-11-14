package org.example;

import java.util.*;

public class HashMapEx3 {

    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("친구", "김연아", "010-0000-0000");
        addPhoneNo("친구", "손연재", "010-1234-0000");
        addPhoneNo("친구", "강감찬", "010-3462-0000");
        addPhoneNo("회사", "홍길동", "010-2356-0000");
        addPhoneNo("회사", "김세모", "010-2342-0000");
        addPhoneNo("회사", "이네모", "010-6373-0000");
        addPhoneNo("세탁", "010-0000-0000");

        printList();
    }

    // 그룹을 추가하는 메소드
    static void addGroup(String groupName) {
            if(!phoneBook.containsKey(groupName)) { // 만약에 그룹에 이름이 없다면 새로운 그룹 hashMap을 만들어라
                phoneBook.put(groupName, new HashMap());
            }
    }

    // 그룹에 전화번호를 추가하는 메서드
    public static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);

        HashMap group = (HashMap)phoneBook.get(groupName);
        group.put(tel, name); // 이름이 중복될 수 있으니 key값으로 전화번호를 받는다
    }

    public static void addPhoneNo(String name, String tel) { // 인자값이 2개인 경우
        addPhoneNo("기타", name, tel); //groupName을 기타로 지정
    }

    // 전화번호부 전체를 출력하는 메소드
    public static void printList() {
        Set set = phoneBook.entrySet();
        System.out.println(set);
        Iterator it = set.iterator();

        System.out.println("**********");
        while(it.hasNext()) { // 하나하나 꺼내 보는 걸 iterator의 도움을 받는다
            Map.Entry e = (Map.Entry)it.next();
            System.out.println(e);

            Set subSet = ((HashMap)(e.getValue())).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

            System.out.println("==================");
            while(subIt.hasNext()) {
                Map.Entry subE = (Map.Entry)subIt.next();
                String telNo = (String)subE.getKey();
                String name = (String)subE.getValue();
                System.out.println(name + " " + telNo);
            } // in while end
            System.out.println();
        } // out while end
    }
}
