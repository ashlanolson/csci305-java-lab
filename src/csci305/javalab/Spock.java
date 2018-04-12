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
public class Spock extends Element
{
     public Spock(String name)
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
                message = "Spock vaporizes Rock";
                finish = "Win";
                out = new Outcome(message,finish);
                break;
            case "Paper":
                message = "Paper disproves Spock";
                finish = "Lose";
                out = new Outcome(message,finish);
                break;
            case "Scissors":
                message = "Spock smashes Scissors";
                finish = "Win";
                out = new Outcome(message, finish);
                break;
            case "Lizard":
                message = "Lizard poisons Spock";
                finish = "Lose";
                out = new Outcome(message,finish);
                break;
            case "Spock":
                message = "Spock equals Spock";
                finish = "Tie";
                out = new Outcome(message,finish);
                break;
        }
        return out;
    
    }
}
