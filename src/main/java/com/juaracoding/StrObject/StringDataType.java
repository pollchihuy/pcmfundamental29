package com.juaracoding.StrObject;

import com.juaracoding.basics.BuatClass;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 01/12/2025 21:30
@Last Modified 01/12/2025 21:30
Version 1.0
*/
public class StringDataType {

    public static void main(String[] args) {
        int x = 10;
        String s = "OK";

        BuatClass b = new BuatClass();
        System.out.println(x);
        System.out.println(s);
        System.out.println(b);
        System.out.println(1L);
        System.out.println(1);
        System.out.println(4.0);
        System.out.println(3.0f);
        System.out.println("OK");
        String strX = "Paul Christian Malau";
        char [] chArr = strX.toCharArray();
        Character d = 'C';
        System.out.println(Character.isDigit(d));
        for (char c:
             chArr) {
            System.out.println(c);
        }
    }
}
