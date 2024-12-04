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
import java.util.Collections;  
 

/**  
 * Class representing a deck of cards.  
 * This class uses the **Singleton Pattern** to ensure only one instance of CardDeck exists.  
 */  
public class CardDeck {  
    private static CardDeck instance; // Singleton instance  
    private ArrayList<Card> cards;  

    // Private constructor to prevent instantiation  
    private CardDeck() {  
        cards = new ArrayList<>();  
        initializeDeck();  
        shuffle();  
    }  

    // Public method to provide access to the singleton instance  
    public static CardDeck getInstance() {  
        if (instance == null) {  
            instance = new CardDeck();  
        }  
        return instance;  
    }  

    private void initializeDeck() {  
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};  
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};  
        
        for (String suit : suits) {  
            for (String rank : ranks) {  
                cards.add(new GoFishCard(rank, suit));  
            }  
        }  
    }  

    public void shuffle() {  
        Collections.shuffle(cards);  
    }  

    public Card drawCard() {  
        return cards.isEmpty() ? null : cards.remove(0);  
    }  

    public int getRemainingCards() {  
        return cards.size();  
    }  
}  