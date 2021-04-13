/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.latihan;

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
        int diskon = 0, totalBelanja;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan total belanjaan: ");
        totalBelanja = input.nextInt();
        
        // if
        if(totalBelanja >= 100000){
            diskon = totalBelanja/10;
            System.out.println("Diskon = " + diskon);
        }
        else {
            System.out.println("Tidak ada diskon!");
        }
        
        // if-else
        int skorUjian = 86; 
        char nilai;
        
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
        
        // switch dari if-else di atas
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilaiUjian = in.nextInt();
        
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
    }
    
}
