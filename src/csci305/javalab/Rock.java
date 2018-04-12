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
public class Rock extends Element 
{
    public Rock(String name)
    {
        super(name);
    }
    
    @Override
    public Outcome compareTo(Element choice)
    {
        String message;
        String finish;
        Outcome out = null;
        
        switch(choice.getName())
        {
            case "Rock":
                message = "Rock equals Rock";
                finish = "Tie";
                out = new Outcome(message,finish);
                break;
            case "Paper":
                message = "Paper covers rock";
                finish = "Lose";
                out = new Outcome(message,finish);
                break;
            case "Scissors":
                message = "Rock smashers scissors";
                finish = "Win";
                out = new Outcome(message,finish);
                break;
            case "Lizard":
                message = "Rock crushes lizard";
                finish = "Win";
                out = new Outcome(message,finish);
                break;
            case "Spock":
                message = "Spock vaporizes Rock";
                finish = "Lose";
                out = new Outcome(message,finish);
                break;
        }
        return out;
    }
}
