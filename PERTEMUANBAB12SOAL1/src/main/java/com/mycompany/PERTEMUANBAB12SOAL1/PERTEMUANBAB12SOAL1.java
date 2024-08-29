/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.PERTEMUANBAB12SOAL1;

/**
 *
 * @author iMOp
 */

public class PERTEMUANBAB12SOAL1  extends PEGAWAI1{
    
    int bonus = 1000000;
    int gajiTotal = gaji + bonus + tunjanganMakan + transport;
    
    public static void main(String[] args) {
        PERTEMUANBAB12SOAL1 sa = new PERTEMUANBAB12SOAL1();
        System.out.println("Gaji SystemAnalyst : "+ sa.gaji);
        System.out.println("Bonus : " + sa.bonus);
        System.out.println("Tunjangan makan : " + sa.tunjanganMakan);
        System.out.println("Transport : " + sa.transport);
        System.out.println("Gaji Total : " + sa.gajiTotal);
    }
}
