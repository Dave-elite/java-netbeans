/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.votingsystem;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Dave
 */
public class VotingSystem {

    public static void main(String[] args) {
        System.out.println("Voter Eligibility");
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Please enter you age...");
        
        int age = input.nextInt();
        
        if(age < 18){
            System.out.println("You are not eligible to vote.");
            
        }else{
            System.out.println("Select the voting method...");
            System.out.println("1. In-person Voting");
            System.out.println("2. Mail-in Voting");
            System.out.println("3. Online Voting");
            
            
            int method = input.nextInt();
            
            switch(method){
                case 1:
                    System.out.println("You have selected In-Person Voting");
                    break;
                    
                case 2:
                    System.out.println("You have selected Mail-in Voting");
                    break;
                    
                case 3:
                    System.out.println("You have selected Online Voting");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2 or 3");
                    break;
                    
            }
            System.out.println("Voter ID numbers...");
            for(int i = 1; i <= 10; i++){
                System.out.println(i);
            
        }
            System.out.println("Number of voter intervals...");
            
            int count = 2;
            while(count <= 20){
                System.out.println(count);
                count += 2;
            }
            int candidate;
            do{
                System.out.println("Select a candidate...");
                System.out.println("1. Candidate 1");
                System.out.println("2. Candidate 2");
                System.out.println("3. Candidate 3");
                System.out.println("4. Candidate 4");
                System.out.println("5. Candidate 5");
                
                candidate = input.nextInt();
                
                if(candidate < 1 || candidate > 5){
                    System.out.println("Invalid choice.Please enter number between 1 and 5");
                }
            }while(candidate < 1 || candidate > 5);
            
            System.out.println("You have choosen Candidate " + candidate + ".");
            
            
            System.out.println("---Election Results---");
            
            int[] votes = new int[5];
            int totalVotes = 0;
            
            for(int i = 0; i < 5; i++){
                votes[i] = random.nextInt(101);//Random votes between 0 and 100
//                System.out.println(votes);
                totalVotes += votes[i];
            }
            System.out.println("Total votes cast: " + totalVotes);
            System.out.println("\nVote Distribution:");
            for(int i = 0; i < 5; i++) {
                double percentage = (votes[i] * 100.0) / totalVotes;
                System.out.printf("Candidate %d: %d votes (%.1f%%)\n", 
                    (i + 1), votes[i], percentage);
            }
            
        }
        input.close();
        
        
    }
}
