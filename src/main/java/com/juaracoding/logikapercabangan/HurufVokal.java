package com.juaracoding.logikapercabangan;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 02/12/2025 20:41
@Last Modified 02/12/2025 20:41
Version 1.0
*/
public class HurufVokal {

    public static void main(String[] args) {
        String huruf = "h";
        if(huruf.equals("a") ||
                huruf.equals("i") ||
                huruf.equals("u") ||
                huruf.equals("e") ||
                huruf.equals("o")
        ){
            System.out.println("Ini Huruf Vokal");
        }else {
            System.out.println("Ini Huruf Konsonan");
        }

        if(huruf.equals("b") ||
                huruf.equals("c") ||
                huruf.equals("d") ||
                huruf.equals("f") ||
                huruf.equals("g") ||
                huruf.equals("h") ||
                huruf.equals("j") ||
                huruf.equals("k")
        ){
            System.out.println("Ini Huruf Konsonan");
        }else {
            System.out.println("Ini Huruf Vokal");
        }
    }
}
