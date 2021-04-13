/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.segitiga;

/**
 *
 * @author hp
 */
public class Segitiga {
    private int lebar;
    
    public Segitiga(int lebar){
        this.lebar = lebar;
    }
    public String gambarSegitiga(){
        String r = "";
        //nested loop
        for (int i = 1; i <= lebar; i++){  
        	for (int j = 1; j <= i; j++)
                		r = r + "[]";
                		r = r + "\n";
            	}
        //pengembalian nilai
        return r;
    }  
}
// COFFEE BREAK DULU    
