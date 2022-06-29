package com.company;

public class Firsthand {
    public static void main(String[] args){
        //первый экземпляр
        Phone phone1=new Phone("Samsung",88005553535L,250);
        phone1.showModel();
        phone1.showNumber();
        phone1.showWeight();
        System.out.println("Номер,полученный,используя возрващающий метод: "+phone1.getNumber());
        System.out.println();
        //второй экземпляр
        Phone phone2=new Phone("Xiaomi",89005553535L,350);
        phone2.showModel();
        phone2.showNumber();
        phone2.showWeight();
        System.out.println("Номер,полученный,используя возрващающий метод: "+phone2.getNumber());
        System.out.println();
        //третий экзмепляр
        Phone phone3=new Phone("Sony",88005553535L,200);
        phone3.showModel();
        phone3.showNumber();
        phone3.showWeight();
        System.out.println("Номер,полученный,используя возрващающий метод: "+phone3.getNumber());
        System.out.println();
        //четвертый экземпляр
        Phone phone4=new Phone();
        System.out.println();
        phone4.receiveCall("Арарат");
        phone1.receiveCall("Степан");
        phone2.receiveCall("Вадим");
        System.out.println();
        phone2.receiveCall("Егор",89873467182L);
        phone3.receiveCall("Женя",89573467182L);
        System.out.println();
        phone1.sendMessage(88005553535L,89005553535L,86005553535L);
    }
}
class Phone{
    private String model="По умолчанию";
    private long number=0;
    private int weight=0;
    //конструкторы объектов
    Phone(String model,long number,int weight){
        this(model,number);
        this.weight=weight;
    }
    Phone(String model,long number){
        this.model=model;
        this.number=number;
    }
    Phone(){
        System.out.println("Привет из конструктора,не принимающего никаких параметров");
    }
    //вывод данных экземпляра класса
    void showModel(){
        System.out.println("Модель телефона: "+model);
    }
    void showNumber(){
            System.out.println("Номер телефона: "+number);
    }
    void showWeight(){
        System.out.println("Вес телефона: "+weight);
    }
    //задание на возвращение номера телефона
    long getNumber(){
        return number;
    }
    void receiveCall(String callName){
        System.out.println("Звонит "+callName);
    }
    void receiveCall(String callName,long callNumber){
        System.out.println("Звонит "+callName+" С номера "+callNumber);
    }
    void sendMessage(long ...v){
        System.out.println("Номера телефонов,с которых вам звонили:");
        for (long l : v) {
            System.out.println(l);
        }
    }
    //Пример Концепции JavaBean,в частности использования геттера и сеттера
    /*
    void setModel(String model){
        this.model=model;
    }
    String getModel(){
        return model;
    }
     */
}

