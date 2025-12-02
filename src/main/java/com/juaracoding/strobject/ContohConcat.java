package com.juaracoding.strobject;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 02/12/2025 19:04
@Last Modified 02/12/2025 19:04
Version 1.0
*/
public class ContohConcat {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        System.out.println(str1.concat(str2));
        System.out.println(str1+str2);
        System.out.println(str1+2);
        StringBuilder sBuild = new StringBuilder();
        System.out.println(sBuild.append("abc").append(2).append("def").append(3).append("ghi").append(4).toString());
        sBuild.setLength(0);
        String strLength = "aj012j3okdlrijwoieru-09i1pko12jk1lk2lkjh";
        System.out.println("Panjang strLength adalah : "+strLength.length());
        //chartAt
        System.out.println("Index ke 13 adalah "+strLength.charAt(13));
        for (int i = 0; i < strLength.length(); i++) {
            System.out.println(strLength.charAt(i));
        }
        char [] chLength = strLength.toCharArray();
        for (int i = 0; i < chLength.length; i++) {
            System.out.println(chLength[i]);
        }
    }
}
