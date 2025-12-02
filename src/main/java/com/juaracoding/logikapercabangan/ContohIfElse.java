package com.juaracoding.logikapercabangan;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 02/12/2025 20:18
@Last Modified 02/12/2025 20:18
Version 1.0
*/
public class ContohIfElse {


    public static void main(String[] args) {
        int intX = 10;
        if(intX>10){
            System.out.println("lebih dari 10");
        }else if(intX <= 10){
            System.out.println("kurang dari atau sama dengan 10");
        }
        System.out.println("Hue");
        if(true){
            if(false){
                System.out.println("IF OK");
            }
        }else{
            System.out.println("ELSE OK");
        }
    }
}
