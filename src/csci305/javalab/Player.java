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
public abstract class Player 
{
    private final String name;
    public Element lastChoice;
    
    public Player(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void last(Element choice)
    {
        this.lastChoice = choice;
    }
    
    public abstract Element play();
}
