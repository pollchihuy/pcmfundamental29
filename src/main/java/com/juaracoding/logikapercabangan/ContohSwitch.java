package com.juaracoding.logikapercabangan;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 02/12/2025 20:28
@Last Modified 02/12/2025 20:28
Version 1.0
*/
public class ContohSwitch {

    public static void main(String[] args) {
        int intX = 4;
        if(intX==1){
            System.out.println("Nilainya 1 ");
        } else if (intX==2) {
            System.out.println("Nilainya 2 ");
        } else if (intX==3) {
            System.out.println("Nilainya 3 ");
        }else {
            System.out.println("Nilainya "+intX);
        }

        switch (intX){
            case 1:
                System.out.println("Nilainya 1 ");break;
            case 2:
                System.out.println("Nilainya 2");break;
            case 3:
                System.out.println("Nilainya 3");break;
            default:
                System.out.println("Nilainya "+intX);break;
        }
    }
}
