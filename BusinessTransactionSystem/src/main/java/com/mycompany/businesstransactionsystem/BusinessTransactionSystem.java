/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.businesstransactionsystem;

/**
 *
 * @author Dave
 */
public class BusinessTransactionSystem {
    //creating an instance of MobileTransaction
    

    public static void main(String[] args) {
        MobileTransaction transaction = new MobileTransaction();
        System.out.println("User's name: "+ transaction.username);
        System.out.println("Initial balance:"+ transaction.startingBalance);
        System.out.println("Deposit amount:"+ transaction.depositAmount);
        System.out.println("Withdrawal amount:"+ transaction.withdrawalAmount);
        System.out.println("Final balance:" + transaction.newBalance);
        
    }
    public static class MobileTransaction{
        //declaring and initializing variables
        String username = "David Njenga";
        double startingBalance = 5000;
        double depositAmount = 4000;
        double withdrawalAmount = 3000;
        double newBalance = (startingBalance + depositAmount) - withdrawalAmount;
    
}
}
