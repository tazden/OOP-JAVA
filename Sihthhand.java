package com.company;

public class Sihthhand {
    public static void main(String[] args){
        Rekursia.rekurs(8,2);
    }
}
class Rekursia{
     public static void rekurs(int A,int B){
        if (A<B){
            System.out.println(A);
            A++;
            rekurs(A,B);
        }else if(A>B){
            System.out.println(B);
            B++;
            rekurs(A,B);
        }
    }
}