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
public class Outcome 
{
    String message;
    String finish;
    
    public Outcome(String message, String finish)
    {
        this.message = message;
        this.finish = finish;
    }
    
    @Override
    public String toString()
    {
        return message + "---" + finish;
    }            
}
