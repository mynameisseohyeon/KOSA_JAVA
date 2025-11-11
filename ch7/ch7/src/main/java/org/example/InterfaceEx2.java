package org.example;


class AA {
    public void show() {
        System.out.println("show method in AA");
    }

    public void disp() {
        System.out.println("disp method in AA");
    }
}

class Multi extends AA implements B, C, A{

    @Override
    public void show() { //A

    }

    @Override
    public void disp() { //A

    }

    @Override
    public void view() { //B

    }

    @Override
    public void draw() { //C

    }

    class Circle implements C {

        @Override
        public void draw() {
            System.out.println(name + "님이");
        }
    }
}

public class InterfaceEx2 {

    public static void main(String[] args) {
        Multi m = new Multi();
        m.show();

        B b = new Multi();
        b.view();

        AA a = new Multi();
    }
}
