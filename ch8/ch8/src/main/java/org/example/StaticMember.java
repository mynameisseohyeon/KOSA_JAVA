package org.example;

class Atm {
    int count; // instance member => 객체 생성 시 꼭 작성 필요
    static int total; // static member => 초기화는 처음에 1회만 가능 => 그 다음부터는 가지고 있던 값을 가져와야 함
    // static method는 공유해서 쓴다 => 은행의 이자율과 같은 경우 사용하기 좋다

    public Atm(int amount) { // constructor method
        count += amount;
        total += amount;
    }

    public void display() {
        count += 50;
        total += 50; // 일반 메소드에서는 일반이나 static멤버 둘 다 사용 가능
        System.out.println("count = " + count);
        System.out.println("total = " + total);
    }

    //static method에서 일반 멤버 변수는 사용할 수 없다
    public static void view() {
        total = total + 100; // static method 안에서는 static member만 사용 가능
        // count = count + 100; // error => 일반 멤버 변수이기 때문
    }


}

public class StaticMember {

    public static void main(String[] args) {
        System.out.println(Atm.total);

        Atm at = new Atm(1000); // 1000원 입금 및 통장 개설
        at.display();
        Atm at2 = new Atm(1000);
        at2.display(); // c : 1000, t : 2000
        Atm at3 = new Atm(1000);
        at3.display(); // c : 1000, t : 3000



    }
}
