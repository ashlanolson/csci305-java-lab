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
public class Lizard extends Element 
{
     public Lizard(String name)
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
                message = "Rock crushes Lizard";
                finish = "Lose";
                out = new Outcome(message,finish);
                break;
            case "Paper":
                message = "Lizard eats paper";
                finish = "Win";
                out = new Outcome(message,finish);
                break;
            case "Scissors":
                message = "Scissors decapitate Lizard";
                finish = "Lose";
                out = new Outcome(message,finish);
                break;
            case "Lizard":
                message = "Lizard equals Lizard";
                finish = "Tie";
                out = new Outcome(message,finish);
                break;
            case "Spock":
                message = "Lizard poisons Spock";
                finish = "Win";
                out = new Outcome(message,finish);
                break;
        }
        return out;
    
    }
}
