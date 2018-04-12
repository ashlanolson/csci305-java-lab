/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci305.javalab;

/**
 *
 * @author Ashlan.olson
 */
public class RandomBot extends Player
{
    public RandomBot(String name)
    {
        super(name);
    }
    
    @Override
    public Element play()
    {
        int random = (int)(Math.random()*5) +1;
        Element choice;
        
        switch(random)
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
            default:
                choice = Main.moves.get("Rock");
                break;
        }
       return choice;      
}
}
