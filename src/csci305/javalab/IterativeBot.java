/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci305.javalab;

/**
 *
 * @author Ashlan.olson
 * Bot that moves through each choice 1 by 1
 */
public class IterativeBot extends Player
{
    private int num = 1;
    
    public IterativeBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Element choice = null;      /*I used a switch statement for the bot to iterate through the choices*/
        
        switch(num){
            case (1):
                choice = Main.moves.get("Rock");
                break;
            case (2):
                choice = Main.moves.get("Paper");
                break;
            case (3):
                choice = Main.moves.get("Scissors");
                break;
            case (4):
                choice = Main.moves.get("Lizard");
                break;
            case (5):
                choice = Main.moves.get("Spock");
                break;
            default:
                break;
        }
        
        num++;
        
        return choice;
    }
    
   
}
