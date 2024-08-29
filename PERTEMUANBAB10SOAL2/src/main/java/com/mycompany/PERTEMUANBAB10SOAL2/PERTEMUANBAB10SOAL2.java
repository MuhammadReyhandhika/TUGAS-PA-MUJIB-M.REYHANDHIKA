/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

       package com.mycompany.PERTEMUANBAB10SOAL2;

/**
 *
 * @author iMOp
 */
public class PERTEMUANBAB10SOAL2 {

public static void main(String[] args) {
     int a=8, b=4;
        
        ARITMATIKA2 aritmatika1 = new ARITMATIKA2();
        aritmatika1.setTambah(a, b);
        System.out.println("bilangan 1 = " + a);
        System.out.println("bilangan 2 = " + b);
        System.out.println("hasil pertambahan " + aritmatika1.getAngka());
        System.out.println();
        
        ARITMATIKA2 aritmatika2 = new ARITMATIKA2();
        aritmatika2.setPerkalian(a, b);
        System.out.println("Bilangan 1 = " + a);
        System.out.println("Bilangan 2 = " + b);
        System.out.println("Hasil Perkalian " + aritmatika2.getAngka());
        
        System.out.println();       
        ARITMATIKA2 aritmatika3 = new ARITMATIKA2();
        
        aritmatika3.setPembagian(a, b);
        System.out.println("Bilangan 1 = " + a);
        System.out.println("Bilangan 2 = " + b);
        System.out.println("Hasil Pembagian " + aritmatika3.getAngka());
        
        System.out.println();
        ARITMATIKA2 aritmatika4 = new ARITMATIKA2();
        
        aritmatika4.setPerkalian(a, b);
        System.out.println("Bilangan 1 = " + a);
        System.out.println("Bilangan 2 = " + b);
        System.out.println("Hasil Perpangkatan " + aritmatika4.getAngka());
    }
}
