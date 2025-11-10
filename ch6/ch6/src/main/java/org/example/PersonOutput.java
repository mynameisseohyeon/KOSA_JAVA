package org.example;

public class PersonOutput {

    public static void main(String[] args) {
        Person p = new Person();

        p.setName("lee");
        p.setPhone("010-0000-0000");
        p.setAge(20);

        p.display();
    }
}
