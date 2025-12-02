package com.juaracoding.excephandling;

import com.juaracoding.basics.BuatClass;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 02/12/2025 21:16
@Last Modified 02/12/2025 21:16
Version 1.0
*/
public class ContohObject {

    public static void main(String[] args) {
        try {
            BuatClass b =null;
            System.out.println(b.toString());
            for (int i = 0; i < 2; i++) {
                System.out.println("Print "+i);
                Thread.sleep(1000);
            }
        }catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
