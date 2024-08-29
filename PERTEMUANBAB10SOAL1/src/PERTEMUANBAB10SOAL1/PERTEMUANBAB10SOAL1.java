/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUANBAB10SOAL1;

/**
 *
 * @author PC RPL - R1
 */
public class PERTEMUANBAB10SOAL1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int a=5, b=3;
        
        ARITMATIKA1 ARITMATIKA1 = new ARITMATIKA1();
        
        ARITMATIKA1.setPertambahan(a, b);
        System.out.println("Bilangan 1 = " + a);
        System.out.println("Bilangan 2 = " + b);
        System.out.println("Hasil Pertambahan " + ARITMATIKA1.getAngka());
    }
}