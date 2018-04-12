/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci305.javalab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Ashlan.olson
 */
public class Main 
{
    static final Map<String, Element> moves = new HashMap();
    
    public static void main(String[] args)
    {
        Element rock = new Rock("Rock");
        Element paper = new Paper("Paper");
        
        moves.put("Rock", new Rock("Rock"));
        moves.put("Paper", new Paper("Paper"));
        moves.put("Scissors", new Scissors("Scissors"));
        moves.put("Lizard", new Lizard("Lizard"));
        moves.put("Spock", new Spock("Spock"));
       
        
        Scanner scan = new Scanner(System.in);
        int choice1 = 0;
        int choice2 = 0;
        Player player1;
        Player player2;
        
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Ashlan Olson!");
        System.out.println("Please choose two players:");
        System.out.println("(1) Human\n" +"(2) Stupidbot\n" + "(3) RandomBot\n" + "(4) IterativeBot\n" + "(5) LastPlayBot\n" + "(6) MyBot\n");
        System.out.println("Select Player 1:");
        while (choice1 <= 6)
        {
            choice1 = scan.nextInt();
            
            if(choice1 < 1 || choice1 > 6)
            {
                System.out.println("Error. Please try again.");
            }
        }
        
        switch (choice1)
        {
            case(1):
                player1 = new Human("Human");
                break;
            case(2):
                player1 = new StupidBot("Stupidbot");
            case(3):
                player1 = new RandomBot("RandomBot");
                break;
            case(4):
                player1 = new IterativeBot("IterativeBot");
                break;
           
        }
        
    }
}
