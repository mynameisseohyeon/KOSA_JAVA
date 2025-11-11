package org.example;

public class InterfaceEx3 {

    public static void main() {
        // 1.
        BB b = new BB();
        b.draw();
        System.out.println(b.su);

        System.out.println("===========");
        // 2.
        IDraw bb = new BB();
        bb.draw();
        System.out.println(bb.su);
    }
}
