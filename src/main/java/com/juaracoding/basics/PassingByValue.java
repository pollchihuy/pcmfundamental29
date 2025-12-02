package com.juaracoding.basics;

public class PassingByValue {

    public static void main(String[] args) {
        int intX = 10;
        changeValue(intX);
        System.out.println("Nilai intX Saat ini : "+intX);
        int intY = intX;
        System.out.println("Nilai intY : "+intY);//?
        intY = 12;
        System.out.println("Nilai intX : "+intX);
        System.out.println("Nilai intY : "+intY);
    }

    public static void changeValue(int intX){
        intX = 13;
    }
}
