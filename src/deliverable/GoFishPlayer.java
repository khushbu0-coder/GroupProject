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
import java.util.HashMap;
import java.util.Map;

/**  
 * Class representing a player in the Go Fish game.  
 * This class adheres to the **Single Responsibility Principle** by focusing on player-related logic.  
 */  
/**  
 * Class representing a player in the Go Fish game.  
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
        checkForSets(); // Check for sets whenever a card is added  
    }  

    public void removeCardFromHand(GoFishCard card) {  
        hand.remove(card);  
    }  

    public void incrementScore() {  
        score++;  
    }  

    // Check for sets of four cards of the same rank  
    private void checkForSets() {  
        Map<String, Integer> rankCount = new HashMap<>();  
        for (GoFishCard card : hand) {  
            rankCount.put(card.getRank(), rankCount.getOrDefault(card.getRank(), 0) + 1);  
        }  
        for (Map.Entry<String, Integer> entry : rankCount.entrySet()) {  
            if (entry.getValue() == 4) {  
                incrementScore();  
                System.out.println(getName() + " has collected a set of four " + entry.getKey() + "s!");  
            }  
        }  
    }  

    @Override  
    public void play() {  
        // Simulate asking for a card from another player  
        System.out.println(getName() + " is playing their turn.");  
        // For simplicity, let's assume they always ask for a random rank  
        if (!hand.isEmpty()) {  
            String requestedRank = hand.get(0).getRank(); // Ask for the rank of the first card in hand  
            System.out.println(getName() + " asks for " + requestedRank + ".");  
        } else {  
            System.out.println(getName() + " has no cards to ask for.");  
        }  
    }  
}  