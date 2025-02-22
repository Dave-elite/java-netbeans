/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcase;
import java.util.Scanner;

/**
 *
 * @author Dave
 */
public class Switchcase {

    public static void main(String[] args) {
        System.out.println("Days of the week");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number to find the corresponding day of the week");
        //input is the Scanner object created above  and the nextInt() method from the Scaner c;ass that reads the next interger entered by the user
        int dayNumber = input.nextInt();
        
        //switch case to output corresponding with the dat
        switch(dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
             
        }
        
        
    }
}
