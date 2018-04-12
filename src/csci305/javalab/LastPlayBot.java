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
public class LastPlayBot extends Player 
{
    private Element last = null;
    
    
    public LastPlayBot(String name)
    {
        super(name);
    }
    
    @Override
    public Element play()
    {
        if(last == null)
        {
            last = new Rock("Rock");
        }
        return last;
    }
    
        
}
