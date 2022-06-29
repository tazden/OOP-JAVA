package com.company;

public class SecondHand {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person("Андрей",14);
        p2.talk();
    }
}
class Person{
    private String fullname;
    private int age;
    Person(String fullname,int age){
        this.fullname=fullname;
        this.age=age;
    }
    Person(){
        System.out.println("Привет из конструктора без параметров");
    }
    void talk(){
        System.out.println(fullname+" Говорит");
    }
}

