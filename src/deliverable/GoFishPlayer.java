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
import java.util.Random;

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

    // Player's turn to ask for cards  
    public void play(ArrayList<Player> players) {  
        System.out.println(getName() + " is playing their turn.");  
        // Randomly ask for a card from another player  
        Random random = new Random();  
        GoFishPlayer targetPlayer = (GoFishPlayer) players.get(random.nextInt(players.size()));  
        String requestedRank = hand.isEmpty() ? "2" : hand.get(0).getRank(); // Ask for the rank of the first card in hand or default to "2"  
        
        System.out.println(getName() + " asks " + targetPlayer.getName() + " for " + requestedRank + ".");  
        
        // Check if the target player has the requested rank  
        boolean hasCard = false;  
        for (GoFishCard card : targetPlayer.getHand()) {  
            if (card.getRank().equals(requestedRank)) {  
                hasCard = true;  
                targetPlayer.removeCardFromHand(card); // Remove the card from the target player's hand  
                this.addCardToHand(card); // Add the card to the current player's hand  
                System.out.println(targetPlayer.getName() + " gives " + requestedRank + " to " + getName() + ".");  
                break;  
            }  
        }  
        
        if (!hasCard) {  
            System.out.println(targetPlayer.getName() + " does not have " + requestedRank + ". Go Fish!");  
        }  
    }  
}  