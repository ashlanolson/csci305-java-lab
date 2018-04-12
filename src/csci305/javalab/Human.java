/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci305.javalab;

import java.util.Scanner;

/**
 *
 * @author Ashlan.olson
 */
public class Human extends Player
{
    public Human(String name)
    {
        super(name);
    }
    
    @Override
    public Element play()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("(1): Rock\n"+"(2): Paper\n"+"(3): Scissors\n"+"(4): Lizard\n"+ "(5): Spock\n");
        System.out.println("Enter your move: ");
        int n = scan.nextInt();
        Element choice = null;
        if(n > 0 && n < 6)
        {
            switch(n)
            {
                case(1):
                    choice = Main.moves.get("Rock");
                    break;
                case(2):
                    choice = Main.moves.get("Paper");
                    break;
                case(3):
                    choice = Main.moves.get("Scissors");
                    break;
                case(4):
                    choice = Main.moves.get("Lizard");
                    break;
                case(5):
                    choice = Main.moves.get("Spock");
                    break;
            }
        }    
        else
        {
            System.out.println("Error. Please try again.");
        }
   return choice;     
}
    
}