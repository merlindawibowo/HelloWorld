/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.bank;

/**
 *
 * @author hp
 */
public class BankAccount {
        private double balance; 
	private int accountNumber;

    	public BankAccount(int accountNumber){
      	   balance = 0;
      	   this.accountNumber = accountNumber;
        }

   	public void deposit(double amount){
          balance = balance + amount;
        }

  	public void withdraw(double amount){
	    balance = balance - amount;
         }
        
        public int getAccountNumber(){   
             return accountNumber;
         }

        public double getBalance(){
           return balance;
        }
  
}
