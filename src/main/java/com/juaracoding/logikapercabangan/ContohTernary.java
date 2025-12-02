package com.juaracoding.logikapercabangan;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 02/12/2025 20:49
@Last Modified 02/12/2025 20:49
Version 1.0
*/
public class ContohTernary {

    public static void main(String[] args) {
        Object o = null;
        if(o==null){
            System.out.println("NULL DETECTED");
        }else {
            System.out.println(o.toString());
        }
        String b = o==null?"":o.toString();
        System.out.println(b);
    }
}
