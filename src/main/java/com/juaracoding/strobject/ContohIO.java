package com.juaracoding.strobject;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 02/12/2025 19:51
@Last Modified 02/12/2025 19:51
Version 1.0
*/
public class ContohIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai Bulet : ");
        int intX = scanner.nextInt();
        System.out.println("Bilangan bulat yang dimasukkan adalah "+intX);

        System.out.print("Masukkan Nilai Desimal : ");
        double douX = scanner.nextDouble();
        System.out.println("Bilangan Desimal yang dimasukkan adalah "+douX);

        System.out.print("Masukkan Teks : ");
        String s = scanner.next();//hardcode
        System.out.println(s);

    }
}