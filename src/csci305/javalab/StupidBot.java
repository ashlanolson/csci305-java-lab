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
public class StupidBot extends Player
{
    public StupidBot(String name)
    {
        super(name);
    }
    
    @Override
    public Element play()
    {
        Element choice = new Paper("Paper"); //Bot chooses paper every time
        return choice;
    }
    
}
