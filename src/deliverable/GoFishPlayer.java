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

public class GoFishPlayer extends Player {  

    private ArrayList<GoFishCard> hand;  
    private int score;  // number of books (collection of 4 cards of the same rank)  

    // Constructor  
    public GoFishPlayer(String name) {  
        super(name);  
        this.hand = new ArrayList<>();  
        this.score = 0;  
    }  

    // Getters  
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
  
    public void incrementScore() { // Added void return type  
        score++;  
    }  

    @Override  
    public void play() {  
        System.out.println(getName() + " is playing their turn.");  
    }  
}  