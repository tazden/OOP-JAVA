package com.company;

public class Student {
    String firstName,lastName,group;
    double averageMark;
    public Student(String firstName,String lastName,String group,double averageMark){
        this.firstName=firstName;
        this.lastName=lastName;
        this.group=group;
        this.averageMark=averageMark;
    }
     String scholarShip(){
        if (averageMark==5){
            return "Стипа 100 грн.";
        }
        else{
            return "Стипа 80 грн." ;
        }
    }
}

