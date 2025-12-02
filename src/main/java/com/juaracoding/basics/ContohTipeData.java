package com.juaracoding.basics;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 01/12/2025 19:27
@Last Modified 01/12/2025 19:27
Version 1.0
*/
public class ContohTipeData {
    public static void main(String[] args) {
        short shoX = 32767;
        byte bytX = (byte) shoX;//127
        System.out.println("Nilai Byte : "+bytX);
        String strY = "Paul";
        System.out.println(strY);
        System.out.println(Integer.toBinaryString(97));
        char chX = 'Z';
        System.out.println(chX);
        System.out.println((int)chX);
        System.out.println("\"");
        System.out.println("Windows \\'");
        boolean b = 1<3;
        System.out.println(b);
    }
}
