/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;


/**
 *
 * @author khush
 */
import java.util.ArrayList;  

/**  
 * Class representing a player in the Go Fish game.  
 * This class adheres to the **Single Responsibility Principle** by focusing on player-related logic.  
 */  
public class GoFishPlayer extends Player {  
    private ArrayList<GoFishCard> hand;  
    private int score;  

    public GoFishPlayer(String name) {  
        super(name);  
        this.hand = new ArrayList<>();  
        this.score = 0;  
    }  

    public ArrayList<GoFishCard> getHand() {  
        return hand;  
    }  

    public int getScore() {  
        return score;  
    }  

    public void addCardToHand(GoFishCard card) {  
        hand.add(card);  
    }  

    public void removeCardFromHand(GoFishCard card) {  
        hand.remove(card);  
    }  
  
    public void incrementScore() {  
        score++;  
    }  

    @Override  
    public void play() {  
        System.out.println(getName() + " is playing their turn.");  
    }  
}   