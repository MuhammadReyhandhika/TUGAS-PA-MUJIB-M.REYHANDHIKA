/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.PERTEMUANBAB5SOAL2;

/**
 *
 * @author iMOp
 */

import java.util.Scanner;

public class PERTEMUANBAB5SOAL2 {
    
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.print("Alas : ");
        double alas = myInput.nextDouble();
        
        System.out.print("Tinggi : ");
        double tinggi = myInput.nextDouble();
        
        double luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga : " + luas);
    }
}
