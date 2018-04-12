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
        choice1 = scan.nextInt();      
        while(choice1 < 1 || choice1 > 6)
        {
            System.out.println("Error. Please enter a number between 1 and 6.");
            choice1 = scan.nextInt();
        }
       
        switch (choice1)
        {
            case(1):
                player1 = new Human("Human");
                break;
            case(2):
                player1 = new StupidBot("Stupidbot");
                break;
            case(3):
                player1 = new RandomBot("RandomBot");
                break;
            case(4):
                player1 = new IterativeBot("IterativeBot");
                break;
            case(5):
                player1 = new LastPlayBot("LastPlayBot");
                break;
            case(6):
                player1 = new MyBot("MyBot");
                break;
            default:
                player1 = new StupidBot("StupidBot");
           
        }
        System.out.println("Select Player 2:");
        choice2 = scan.nextInt();
        if(choice2 < 1 || choice2 > 6)
        {
            System.out.println("Error. Please try again.");
            choice2 = scan.nextInt();
        }
        
        switch (choice2)
        {
            case(1):
                player2 = new Human("Human");
                break;
            case(2):
                player2 = new StupidBot("Stupidbot");
                break;
            case(3):
                player2 = new RandomBot("RandomBot");
                break;
            case(4):
                player2 = new IterativeBot("IterativeBot");
                break;
            case(5):
                player2 = new LastPlayBot("LastPlayBot");
                break;
            case(6):
                player2 = new MyBot("MyBot");
                break;
            default:
                player2 = new StupidBot("StupidBot");
           
        }
        System.out.println(player1.getName() + " vs " + player2.getName() + ". Go!");
    }
}
