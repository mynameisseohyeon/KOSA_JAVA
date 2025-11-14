package org.example;

import java.util.*;

public class MapEx {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("kosa", "1234"); // id, pw
        map.put("sbs", "1111");
        map.put("kbs", "1234");
        map.put("kbs", "1004"); // key값이 중복된 경우 가장 마지막에 입력한 값이 저장되게 된다 value값의 경우에는 중복 허용 가능

        System.out.println("요소 개수 : " + map.size());
        map.put("id", "pwd");
        System.out.println(map);
        System.out.println(map.get("sbs")); // 유일성을 가지는 key값은 중복되지 않기 때문에 다음과 같이 꺼내서 값을 확인할 수 있따

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("id/pwd를 입력하세요.");
            System.out.println("id : "); String id = sc.nextLine().trim();
            System.out.println("pwd : "); String pwd = sc.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) { // 동일한 아이디 존재하지 않을 경우
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            } else {
                if(!(map.get(id).equals(pwd))) {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                } else {
                    System.out.println("id와 pw가 일치합니다.");
                    break;
                }
            }
        }

    }

}
