/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.helloword;

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
        // 1. Hello Word
        System.out.println("Hello World!");
        System.out.println("");
        
        // 2. Keliling lingkaran
        double pi = 3.1416;
        double r = 2.12;
        double keliling;
        keliling = 2 * pi * r;
        System.out.println("Keliling lingkaran = " + keliling);
        System.out.println("");
        
        // 3. Bilangan Beraksi
        Bilangan b1 = new Bilangan(50);
        b1.info();
        
     	Bilangan b2 = new Bilangan(15);
    	b2.info();

     	Bilangan b3 = new Bilangan(30);
        b3.info();
        
        // 4. karakter
        char karakter1= 88, karakter2='X', karakter3='Y';
        
        System.out.println(karakter1);
        System.out.println(karakter2);
        System.out.println(karakter3);
        
        // 5. input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan bilangan: ");
        int bil = input.nextInt();
        
        System.out.println("");
        
        if(bil == 0)
            System.out.println(bil + " adalah nol!");
        
        else if(bil > 0)
            System.out.println(bil + " adalah bilangan positif!");
        
        else
            System.out.println(bil + " adalah bilangan negatif!");
    }
    
}
