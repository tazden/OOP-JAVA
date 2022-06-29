package com.company;

public class fivethhand {
    public static void main(String[] args){
        Student student1=new Student("Петр","Иванов","РНГМ",5.0);
        Aspirant aspirant1=new Aspirant("Иван","Петров","АИВТ",3.7,"Разработка шельфов");
        Student[]students={student1,aspirant1};
        for (Student s:students){
            System.out.println(s.scholarShip());
        }
        
    }
}
