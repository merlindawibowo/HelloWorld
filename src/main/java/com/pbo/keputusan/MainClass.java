/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.keputusan;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diskon = 0, totalBelanja = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan total belanja: ");
        totalBelanja = input.nextInt();
        
        // 1. if 
	if(totalBelanja >= 100000){
		diskon = totalBelanja/10;
	}
	System.out.println("Diskon = " + diskon);
        System.out.println("");
        
        // 2. if - else bilangan positif dan negatif
        int bil;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        bil = in.nextInt();
        
        if(bil >= 0){
            System.out.println(bil + " adalah bilangan positif.");
        }
        else{
            System.out.println(bil + " adalah bilangan negatif.");
        }
        System.out.println("");
        
        // if-else-if
        int skorUjian= 86; char nilai;
	
        if (skorUjian >= 90) {
		nilai = 'A';
	} else if (skorUjian >= 80) {
		nilai = 'B';
	} else if (skorUjian >= 70) {
		nilai = 'C';
	} else {
		nilai = 'D';
	}
        
	System.out.println("Nilai = " + nilai);
        System.out.println("");  
        
        // switch --> merubah yg if-else-if
        int nilaiUjian;
		
	Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        nilaiUjian = masukan.nextInt();
		
	switch(nilaiUjian/10){
		case 10: 
		    System.out.println("A");
                    break;
                case 9: 
                    System.out.println("A");
                    break;
                case 8: 
                    System.out.println("B");
                    break;
                case 7: 
                    System.out.println("C");
                    break;
                default : 
                    System.out.println("D");
                    break;	
                }
        
        // for
        String[] kota = {"Jakarta", "Surabaya", "Semarang"};
        
        for(int i=0; i<kota.length; i++){
            System.out.println(kota[i]);
        }
        System.out.println("");
    }
}
