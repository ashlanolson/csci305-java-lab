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
 * My bot decided to only play elements that start with s
 */
public class MyBot extends Player
{
    public MyBot(String name)
    {
        super(name);
    }
    
    @Override
    public Element play()
    {
        int random = (int)(Math.random()*2 +1);
        Element choice = null;
         switch(random)
        {
            case(1):
                choice = Main.moves.get("Scissors");
                break;
            case(2):
                choice = Main.moves.get("Spock");
                break;
            default:
                choice = Main.moves.get("Scissors");
                break;
        }
       return choice;      
}
}

        
