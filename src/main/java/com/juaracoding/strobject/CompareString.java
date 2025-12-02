package com.juaracoding.strobject;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 02/12/2025 19:31
@Last Modified 02/12/2025 19:31
Version 1.0
*/
public class CompareString {

    public static void main(String[] args) {
        String str1 = "Paul";
        String str2 = new String("paul");
        System.out.println("str1 : "+str1);
        System.out.println("str2 : "+str2);
        System.out.println("hash str1 "+System.identityHashCode(str1));
        System.out.println("hash str2 "+System.identityHashCode(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1==str2);
    }
}
