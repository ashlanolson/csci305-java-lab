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
public class Paper extends Element
{
    public Paper(String name)
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
                message = "Paper covers rock";
                finish = "Win";
                out = new Outcome(message,finish);
                break;
            case "Paper":
                message = "Paper equals paper";
                finish = "Tie";
                out = new Outcome(message,finish);
                break;
            case "Scissors":
                message = "Scissors cuts Paper";
                finish = "Lose";
                out = new Outcome(message,finish);
                break;
            case "Lizard":
                message = "Lizard eats Paper";
                finish = "Lose";
                out = new Outcome(message,finish);
                break;
            case "Spock":
                message = "Paper disproves Spock";
                finish = "Win";
                out = new Outcome(message,finish);
                break;
        }
        return out;
    }
    
}
