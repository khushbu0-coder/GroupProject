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

public class GoFishGame extends Game {  
    private CardDeck deck; // Composition  
    private int rounds; // Number of rounds to play  
    private static final int MAX_ROUNDS = 4; // Total rounds to play  

    public GoFishGame(String name, ArrayList<GoFishPlayer> players) {  
        super(name);  
        setPlayers(new ArrayList<>(players)); // Use the setPlayers method from the parent class  
        this.rounds = 0; // Initialize rounds  
        this.deck = new CardDeck(); // Initialize the deck  
    }  

    @Override  
    public void play() {  
        while (rounds < MAX_ROUNDS) {  
            System.out.println("Round " + (rounds + 1) + ":");  
            dealCards(7); // Deal cards at the start of each round  
            for (Player player : getPlayers()) { // Use getPlayers() to access the players  
                ((GoFishPlayer) player).play(); // Call play method for each player  
            }  
            rounds++;  
        }  
        declareWinner(); // Declare the winner after all rounds  
    }  

    public void dealCards(int numberOfCards) {  
        for (int i = 0; i < numberOfCards; i++) {  
            for (Player player : getPlayers()) { // Use getPlayers() to access the players  
                GoFishCard card = (GoFishCard) deck.drawCard();  
                if (card != null) {  
                    ((GoFishPlayer) player).addCardToHand(card); // Cast to GoFishPlayer  
                } else {  
                    System.out.println("No more cards left in the deck.");  
                    return; // Exit if no cards are left  
                }  
            }  
        }  
    }  

    @Override  
    public void declareWinner() {  
        // Implement the logic to declare the winner  
        GoFishPlayer winner = null;  
        int maxScore = -1;  

        for (Player player : getPlayers()) {  
            if (player instanceof GoFishPlayer) {  
                GoFishPlayer goFishPlayer = (GoFishPlayer) player;  
                if (goFishPlayer.getScore() > maxScore) {  
                    maxScore = goFishPlayer.getScore();  
                    winner = goFishPlayer;  
                }  
            }  
        }  

        if (winner != null) {  
            System.out.println("The winner is " + winner.getName() + " with a score of " + maxScore);  
        } else {  
            System.out.println("No winner could be determined.");  
        }  
    }  
}  