package com.juaracoding.basics;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 01/12/2025 20:10
@Last Modified 01/12/2025 20:10
Version 1.0
*/
public class PassingByReference {

    public static void main(String[] args) {
        BuatClass buatClass = new BuatClass();
        System.out.println("reference buat class "+buatClass);
        ContohReference contohReference = new ContohReference();
        System.out.println("Reference contohReference "+contohReference);
        contohReference.setX(15);
        System.out.println("Nilai X : "+contohReference.getX());
        ContohReference contohReference1 = contohReference;
        System.out.println("Reference contohReference1 "+contohReference1);
        System.out.println("Nilai X pada contohReference1 : "+contohReference1.getX());
        contohReference1.setX(25);
        System.out.println("Nilai X contohReference : "+contohReference.getX());
        changeReferenceValue(contohReference1);
        System.out.println("Nilai X pada conference : "+contohReference.getX());
    }

    public static void changeReferenceValue(ContohReference c){
        c.setX(77);
    }
}
