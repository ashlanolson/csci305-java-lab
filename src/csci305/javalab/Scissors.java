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
public class Scissors extends Element
{
    public Scissors(String name)
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
                message = "Rock crushes Scissors";
                finish = "Lose";
                out = new Outcome(message,finish);
                break;
            case "Paper":
                message = "Scissors cut Paper";
                finish = "Win";
                out = new Outcome(message,finish);
                break;
            case "Scissors":
                message = "Scissors equals Scissors";
                finish = "Tie";
                out = new Outcome(message,finish);
                break;
            case "Lizard":
                message = "Scissors decapitate Lizard";
                finish = "Win";
                out = new Outcome(message,finish);
                break;
            case "Spock":
                message = "Spock smashes Scissors";
                finish = "Lose";
                out = new Outcome(message,finish);
                break;
        }
        return out;
    
    }
}
