/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.control.structures;
import java.util.Scanner;
/**
 *
 * @author Dave
 */
public class ControlStructures {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
Scanner scanner = new Scanner(System.in);
//Ask the user to input the marks
System.out.println("Enter the average mark: ");
int mark = scanner.nextInt();
        
        if(mark >= 70){
            System.out.println("Grade: A");
        }else if(mark >= 60){
            System.out.println("Grade: B");
        }else if(mark >= 50){
            System.out.println("Grade: C");
        }else if(mark >= 40){
            System.out.println("Grade: D");
        }else if(mark >= 30){
            System.out.println("Failed");
        }else{
            System.out.println("Retake");
        }
        
        //close the scanner object to avoid memeory leaks
        scanner.close();
    }
}
