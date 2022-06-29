package com.company;

public class Aspirant extends Student{
    String scWork;
    public Aspirant(String firstName,String lastname,String group,double averageMark,String scWork){
        super(firstName,lastname,group,averageMark);
        this.scWork=scWork;
    }
    @Override
    String scholarShip(){
        if (averageMark==5){
            return "Стипа 200 грн.";
        }
        else{
            return "Стипа 180 грн." ;
        }
    }

}
